package com.horsefi.horsemain.entity;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@DynamicUpdate
@Entity
@Table(name = "blind_box")
public class BlindBox {
    @Id
    @Column(name = "algebra")
    private int algebra;
    @Column(name = "transaction_hash")
    private String transaction_hash;
    @Column(name = "transaction_time")
    private Timestamp transaction_time;
    @Column(name = "buyer")
    private String buyer;
    @Column(name = "price")
    private double price;
    @Column(name = "sell_round")
    private int sell_round;
}
