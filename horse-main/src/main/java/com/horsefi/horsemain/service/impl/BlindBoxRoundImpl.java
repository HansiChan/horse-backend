package com.horsefi.horsemain.service.impl;

import com.horsefi.horsemain.entity.BlindBoxRound;
import com.horsefi.horsemain.service.BlindBoxRoundRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlindBoxRoundImpl {
    private final BlindBoxRoundRepository blindBoxRoundRepository;

    @Autowired
    public BlindBoxRoundImpl(BlindBoxRoundRepository blindBoxRoundRepository) {
        this.blindBoxRoundRepository = blindBoxRoundRepository;
    }

    void saveBlindBoxRound(BlindBoxRound blindBoxRound){
        blindBoxRoundRepository.save(blindBoxRound);
    }

    List<BlindBoxRound> getRoundList() {
        return blindBoxRoundRepository.findAll();
    }
}
