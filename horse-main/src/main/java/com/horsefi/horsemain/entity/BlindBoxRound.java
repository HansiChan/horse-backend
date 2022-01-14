package com.horsefi.horsemain.entity;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@DynamicUpdate
@Entity
@Table(name = "blind_box_round")
public class BlindBoxRound {

    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "amount")
    private int amount;
    @Column(name = "limit_per_user")
    private int limit_per_user;
    @Column(name = "price")
    private double price = 0;
    @Column(name = "currency")
    private String currency;
    @Column(name = "start_time")
    private long start_time;
    @Column(name = "end_time")
    private long end_time;
    @Column(name = "legendary_rate")
    private String legendary_rate;
    @Column(name = "epic_rate")
    private String epic_rate;
    @Column(name = "rare_rate")
    private String rare_rate;
    @Column(name = "normal_rate")
    private String normal_rate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}