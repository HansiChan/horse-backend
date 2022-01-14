package com.horsefi.horsemain.service.impl;

import com.horsefi.horsemain.entity.BlindBoxRound;
import com.horsefi.horsemain.service.BlindBoxRoundReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlindBoxRoundImpl {
    private final BlindBoxRoundReposity blindBoxRoundReposity;

    @Autowired
    public BlindBoxRoundImpl(BlindBoxRoundReposity blindBoxRoundReposity) {
        this.blindBoxRoundReposity = blindBoxRoundReposity;
    }

    void saveBlindBoxRound(BlindBoxRound blindBoxRound){
        blindBoxRoundReposity.save(blindBoxRound);
    }

    List<BlindBoxRound> getRoundList() {
        return blindBoxRoundReposity.findAll();
    }
}
