package com.horsefi.horsemain.controller;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.horsefi.horsemain.entity.BlindBox;
import com.horsefi.horsemain.entity.ResponseEntity;
import com.horsefi.horsemain.service.impl.BlindBoxImpl;
import com.horsefi.horsemain.service.impl.HorseMainImpl;
import com.horsefi.horsemain.service.impl.NftImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.*;

@Api(value = "HorseMain", tags = "HorseMain")
@RestController
@EnableAsync
public class HorseMainController {

    private final HorseMainImpl horseMainImpl;

    private final Gson gson = new Gson();


    @Autowired
    public HorseMainController(HorseMainImpl horseMainImpl) {
        this.horseMainImpl = horseMainImpl;
;
    }

    @ApiOperation("save transaction")
    @RequestMapping(value = "${config.root-url}/save", method = RequestMethod.POST)
    @ResponseBody
    String saveTransaction(@RequestBody String req) {
        JsonObject reqJson = JsonParser.parseString(req).getAsJsonObject();

        try {
            BlindBox blindBox = gson.fromJson(reqJson,BlindBox.class);
            horseMainImpl.saveBlindBox(blindBox);
            return gson.toJson(new ResponseEntity(0, "success!"));
        } catch (Exception e) {
            e.printStackTrace();
            return gson.toJson(new ResponseEntity(-1, e.getMessage()));
        }
    }


}
