package com.horsefi.horsemain.service;

import com.horsefi.horsemain.entity.BlindBox;
import com.horsefi.horsemain.entity.BlindBoxRound;

import java.util.List;

public interface HorseMainService {

    void saveBlindBox(BlindBox blindBox);

    String getNftInfo(String algebra);

    void saveBlindBoxRound(BlindBoxRound blindBoxRound);

    List<BlindBoxRound> getRoundList();

    List<BlindBox> getTransaction();
}
