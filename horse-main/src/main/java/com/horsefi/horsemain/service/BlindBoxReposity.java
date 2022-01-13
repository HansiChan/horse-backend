package com.horsefi.horsemain.service;

import com.horsefi.horsemain.entity.BlindBox;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlindBoxReposity extends JpaRepository<BlindBox, String> {
}