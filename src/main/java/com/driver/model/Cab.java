package com.driver.model;

import com.driver.model.Driver;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity

public class Cab {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int ID;
    private int perKmRate;
    private boolean available;
    @OneToOne
    @JoinColumn
    private Driver driver;

    public Cab() {
    }

    public Cab(int ID, int perKmRate, boolean available, Driver driver) {
        this.ID = ID;
        this.perKmRate = perKmRate;
        this.available = available;
        this.driver = driver;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getPerKmRate() {
        return perKmRate;
    }

    public void setPerKmRate(int perKmRate) {
        this.perKmRate = perKmRate;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}