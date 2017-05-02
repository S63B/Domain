package com.S63B.domain.Entities;

import javax.persistence.*;

@Entity
@NamedQueries({
        @NamedQuery(name = "Pol.getPolls", query = "SELECT pol FROM Pol AS pol WHERE tracker.id = :trackerID"),
        @NamedQuery(name = "Pol.getPollsBetween", query = "SELECT pol FROM Pol AS pol WHERE tracker.id = :trackerID AND timestampMillis BETWEEN :startDate AND :endDate"),
        @NamedQuery(name = "Pol.deletePolls", query = "DELETE FROM Pol p WHERE p.tracker.id = :trackerID")
})
public class Pol implements Comparable<Pol> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @OneToOne
    private Tracker tracker;

    private double lat;
    private double lng;
    private long timestampMillis;

    public Pol() {}

    public Pol(Tracker tracker, double lat, double lng, long timestampMillis) {
        this.tracker = tracker;
        this.lat = lat;
        this.lng = lng;
        this.timestampMillis = timestampMillis;
    }

    public String getId() {
        return id;
    }

    public double getLat() {
        return lat;
    }

    public double getLng() {
        return lng;
    }

    public long getTimestampMillis() {
        return timestampMillis;
    }

    public Tracker getTracker() {
        return tracker;
    }

    @Override
    public int compareTo(Pol o) {
        return (int) (this.getTimestampMillis() - o.getTimestampMillis());
    }
}
