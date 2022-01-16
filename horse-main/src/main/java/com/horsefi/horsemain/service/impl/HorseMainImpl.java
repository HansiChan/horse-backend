package com.horsefi.horsemain.service.impl;

import com.horsefi.horsemain.entity.BlindBox;
import com.horsefi.horsemain.entity.BlindBoxRound;
import com.horsefi.horsemain.service.HorseMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HorseMainImpl implements HorseMainService {

    private final NftImpl nftImpl;
    private final BlindBoxImpl blindBoxImpl;
    private final BlindBoxRoundImpl blindBoxRoundImpl;

    @Autowired
    public HorseMainImpl(NftImpl nftImpl, BlindBoxImpl blindBoxImpl, BlindBoxRoundImpl blindBoxRoundImpl) {
        this.nftImpl = nftImpl;
        this.blindBoxImpl = blindBoxImpl;
        this.blindBoxRoundImpl = blindBoxRoundImpl;
    }

    @Override
    public void saveBlindBox(BlindBox blindBox) throws Exception {
        blindBoxImpl.saveBlindBox(blindBox);
    }

    @Override
    public String getNftInfo(String algebra) {
        return nftImpl.getNftInfo(algebra);
    }

    @Override
    public void saveBlindBoxRound(BlindBoxRound blindBoxRound) {
        blindBoxRoundImpl.saveBlindBoxRound(blindBoxRound);
    }

    @Override
    public List<BlindBoxRound> getRoundList() {
        return blindBoxRoundImpl.getRoundList();
    }

    @Override
    public List<BlindBox> getTransaction() {
        return blindBoxImpl.getTransaction();
    }


}
