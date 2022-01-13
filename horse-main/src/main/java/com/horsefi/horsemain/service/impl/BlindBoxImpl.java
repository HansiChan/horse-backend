package com.horsefi.horsemain.service.impl;

import com.horsefi.horsemain.entity.BlindBox;
import com.horsefi.horsemain.service.BlindBoxReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlindBoxImpl {

    private final BlindBoxReposity blindBoxReposity;

    @Autowired
    public BlindBoxImpl(BlindBoxReposity blindBoxReposity) {
        this.blindBoxReposity = blindBoxReposity;
    }

    void saveBlindBox(BlindBox blindBox) {
        blindBoxReposity.save(blindBox);
    }
}
