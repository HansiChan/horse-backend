package com.horsefi.horsemain.service.impl;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.horsefi.horsemain.entity.BlindBox;
import com.horsefi.horsemain.service.BlindBoxReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Objects;

@Service
public class BlindBoxImpl {

    private final BlindBoxReposity blindBoxReposity;
    private final RestTemplate restTemplate;

    @Value("${config.contract}")
    private String contract;
    @Value("${config.transactionUrl}")
    private String apiUrl;

    @Autowired
    public BlindBoxImpl(BlindBoxReposity blindBoxReposity, RestTemplateBuilder builder) {
        this.blindBoxReposity = blindBoxReposity;
        this.restTemplate = builder.build();
    }

    void saveBlindBox(BlindBox blindBox) {

        String url = String.format(apiUrl, contract, blindBox.getBuyer());
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> request = new HttpEntity<>(headers);
        org.springframework.http.ResponseEntity<String> entity = restTemplate.postForEntity(url, request, String.class);
        JsonObject entityJson = JsonParser.parseString(Objects.requireNonNull(entity.getBody())).getAsJsonObject();
        JsonArray transactionList = entityJson.getAsJsonArray("result");
        for (JsonElement transaction : transactionList) {
            String transactionHash = blindBox.getTransaction_hash();
            String addressHash = transaction.getAsJsonObject().get("hash").toString().replace("\"", "");
            if (addressHash.equals(transactionHash)) {
                blindBox.setAlgebra(transaction.getAsJsonObject().get("tokenID").getAsInt());
            }
        }
        blindBoxReposity.save(blindBox);
    }

    List<BlindBox> getTransaction() {
        return blindBoxReposity.findAll();
    }
}
