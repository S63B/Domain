package com.S63B.domain.Entities;

import javax.persistence.*;

@Entity
@NamedQueries({
        @NamedQuery(name = "Tracker.getPolls", query = "SELECT pol FROM Pol AS pol WHERE tracker.id = :trackerID"),
        @NamedQuery(name = "Tracker.getPollsBetween", query = "SELECT pol FROM Pol AS pol WHERE tracker.id = :trackerID AND timestampMillis BETWEEN :startDate AND :endDate")
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

    public Pol(double lat, double lng, long timestampMillis) {
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
