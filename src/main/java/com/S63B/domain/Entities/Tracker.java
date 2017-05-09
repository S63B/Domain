package com.S63B.domain.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

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
    @JsonBackReference
    private Car car;

    @OneToMany
    @JsonBackReference
    private List<Pol> polls;

    public Tracker() {
        this.polls = new ArrayList<>();
    }

    public Tracker(String serialNumber, String country) {
        this.serialNumber = serialNumber;
        this.country = country;
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

    public void setCar(Car car){
        this.car = car;
    }
    //endregion
}
