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

    public int getAlgebra() {
        return algebra;
    }

    public void setAlgebra(int algebra) {
        this.algebra = algebra;
    }

    public String getTransaction_hash() {
        return transaction_hash;
    }

    public void setTransaction_hash(String transaction_hash) {
        this.transaction_hash = transaction_hash;
    }

    public Timestamp getTransaction_time() {
        return transaction_time;
    }

    public void setTransaction_time(Timestamp transaction_time) {
        this.transaction_time = transaction_time;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSell_round() {
        return sell_round;
    }

    public void setSell_round(int sell_round) {
        this.sell_round = sell_round;
    }

    @Override
    public String toString() {
        return "BlindBox{" +
                "algebra=" + algebra +
                ", transaction_hash='" + transaction_hash + '\'' +
                ", transaction_time=" + transaction_time +
                ", buyer='" + buyer + '\'' +
                ", price=" + price +
                ", sell_round=" + sell_round +
                '}';
    }
}
