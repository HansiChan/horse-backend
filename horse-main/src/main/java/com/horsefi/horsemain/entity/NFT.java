package com.horsefi.horsemain.entity;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@DynamicUpdate
@Entity
@Table(name = "horse_nft")
public class NFT {

    @Id
    @Column(name = "algebra")
    private int algebra;
    @Column(name = "type")
    private String type;
    @Column(name = "speed")
    private int speed;
    @Column(name = "lucky")
    private int lucky;
    @Column(name = "breeding_times")
    private long breeding_times;
    @Column(name = "owner")
    private String owner;
    @Column(name = "equipment", columnDefinition = "text")
    private String equipment = "";
}
