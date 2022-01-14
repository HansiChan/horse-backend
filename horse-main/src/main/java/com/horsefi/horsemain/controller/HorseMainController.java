package com.horsefi.horsemain.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.horsefi.horsemain.entity.BlindBox;
import com.horsefi.horsemain.entity.BlindBoxRound;
import com.horsefi.horsemain.entity.ResponseEntity;
import com.horsefi.horsemain.service.impl.HorseMainImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "HorseMain", tags = "HorseMain")
@RestController
@EnableAsync
public class HorseMainController {

    private final HorseMainImpl horseMainImpl;

    private final Gson gson = new Gson();

    @Autowired
    public HorseMainController(HorseMainImpl horseMainImpl) {
        this.horseMainImpl = horseMainImpl;
    }

    @ApiOperation("save transaction")
    @RequestMapping(value = "${config.root-url}/save_transaction", method = RequestMethod.POST)
    @ResponseBody
    String saveTransaction(@RequestBody String req) {
        JsonObject reqJson = JsonParser.parseString(req).getAsJsonObject();

        try {
            BlindBox blindBox = gson.fromJson(reqJson, BlindBox.class);

            horseMainImpl.saveBlindBox(blindBox);
            return gson.toJson(new ResponseEntity(0, "success!"));
        } catch (Exception e) {
            e.printStackTrace();
            return gson.toJson(new ResponseEntity(-1, e.getMessage()));
        }
    }

    @ApiOperation("create blind box round")
    @RequestMapping(value = "${config.root-url}/create_round", method = RequestMethod.POST)
    @ResponseBody
    String createBlindBoxRound(@RequestBody String req) {
        JsonObject reqJson = JsonParser.parseString(req).getAsJsonObject();

        try {
            BlindBoxRound blindBoxRound = gson.fromJson(reqJson, BlindBoxRound.class);

            horseMainImpl.saveBlindBoxRound(blindBoxRound);
            return gson.toJson(new ResponseEntity(0, "success!"));
        } catch (Exception e) {
            e.printStackTrace();
            return gson.toJson(new ResponseEntity(-1, e.getMessage()));
        }
    }

    @ApiOperation("get blind box round list")
    @RequestMapping(value = "${config.root-url}/get_round", method = RequestMethod.GET)
    @ResponseBody
    String getRoundList() {
        try {

            List<BlindBoxRound> roundList = horseMainImpl.getRoundList();
            System.out.println(roundList.toString());
            return gson.toJson(new ResponseEntity(0, roundList));
        } catch (Exception e) {
            e.printStackTrace();
            return gson.toJson(new ResponseEntity(-1, e.getMessage()));
        }
    }

    @ApiOperation("get blind box transaction list")
    @RequestMapping(value = "${config.root-url}/get_transaction", method = RequestMethod.GET)
    @ResponseBody
    String getTransaction() {
        try {

            List<BlindBox> transactionList = horseMainImpl.getTransaction();
            return gson.toJson(new ResponseEntity(0, transactionList));
        } catch (Exception e) {
            e.printStackTrace();
            return gson.toJson(new ResponseEntity(-1, e.getMessage()));
        }
    }

}
