package com.horsefi.horsemain.service.impl;

import com.horsefi.horsemain.entity.BlindBox;
import com.horsefi.horsemain.service.HorseMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HorseMainImpl implements HorseMainService {

    private final NftImpl nftImpl;
    private final BlindBoxImpl blindBoxImpl;

    @Autowired
    public HorseMainImpl(NftImpl nftImpl,BlindBoxImpl blindBoxImpl)  {
        this.nftImpl = nftImpl;
        this.blindBoxImpl = blindBoxImpl;
    }

    @Override
    public void saveBlindBox(BlindBox blindBox) {
        blindBoxImpl.saveBlindBox(blindBox);
    }

    @Override
    public String getNftInfo(String algebra) {
        return nftImpl.getNftInfo(algebra);
    }


}
