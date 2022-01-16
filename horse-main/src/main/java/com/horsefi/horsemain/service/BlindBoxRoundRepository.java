package com.horsefi.horsemain.service;

import com.horsefi.horsemain.entity.BlindBoxRound;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlindBoxRoundRepository extends JpaRepository<BlindBoxRound, Integer> {
}
