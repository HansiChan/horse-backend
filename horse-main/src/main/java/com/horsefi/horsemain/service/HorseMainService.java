package com.horsefi.horsemain.service;

import com.horsefi.horsemain.entity.BlindBox;

public interface HorseMainService {

    void saveBlindBox(BlindBox blindBox);

    String getNftInfo(String algebra);
}
