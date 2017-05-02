package com.S63B.domain.Entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NamedQueries({
        @NamedQuery(name = "Tracker.getTracker", query = "SELECT tracker FROM Tracker AS tracker WHERE id = :trackerID")
})
public class Tracker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String serialNumber;
    private String country;

    @OneToOne
    private Car car;

    @OneToMany
    private List<Pol> polls;

    public Tracker() {
        this.polls = new ArrayList<>();
    }

    public Tracker(String serialNumber, String country, Car car) {
        this.serialNumber = serialNumber;
        this.country = country;
        this.car = car;
        this.polls = new ArrayList<>();
    }

    //region Getters and setters

    public int getId() {
        return id;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getCountry() {
        return country;
    }

    public List<Pol> getPolls() {
        return polls;
    }

    public boolean addPol(Pol pol){
        return polls.add(pol);
    }

    public boolean removePol(Pol pol){
        return polls.remove(pol);
    }

    public Car getCar() {
        return car;
    }
    //endregion
}
