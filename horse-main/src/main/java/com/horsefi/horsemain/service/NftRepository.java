package com.horsefi.horsemain.service;

import com.horsefi.horsemain.entity.NFT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NftRepository extends JpaRepository<NFT, Integer> {
}
