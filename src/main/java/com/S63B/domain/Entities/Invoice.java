package com.S63B.domain.Entities;

import org.joda.time.DateTime;

import javax.persistence.*;

/**
 * Created by arjan on 28-3-2017.
 */
@Entity
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    private Owner user;

    private DateTime date;
    private double totalPrice;
    private DateTime startDate;
    private DateTime endDate;
    private int paymentStatus;
    private String countryOfOrigin;

    public Invoice() {

    }

    public Invoice(int id, Owner user, DateTime date, double totalPrice, DateTime startDate, DateTime endDate, int paymentStatus, String countryOfOrigin) {
        this.id = id;
        this.user = user;
        this.date = date;
        this.totalPrice = totalPrice;
        this.startDate = startDate;
        this.endDate = endDate;
        this.paymentStatus = paymentStatus;
        this.countryOfOrigin = countryOfOrigin;
    }

    //region Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Owner getUser() {
        return user;
    }

    public void setUser(Owner user) {
        this.user = user;
    }

    public DateTime getDate() {
        return date;
    }

    public void setDate(DateTime date) {
        this.date = date;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }

    public int getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(int paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    //endregion
}
