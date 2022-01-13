package com.horsefi.horsemain.service.impl;

import com.horsefi.horsemain.entity.NFT;
import com.horsefi.horsemain.service.NftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NftImpl {

    private final NftRepository nftRepository;

    @Autowired
    public NftImpl(NftRepository nftRepository) {
        this.nftRepository = nftRepository;
    }

    String getNftInfo(String algebra) {
        NFT nftInfo = nftRepository.findById(algebra).orElseGet(NFT::new);
        return nftInfo.toString();
    }


}
