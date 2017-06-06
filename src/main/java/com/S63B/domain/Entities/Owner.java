package com.S63B.domain.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by arjan on 28-3-2017.
 */
@Entity
@NamedQueries({
        @NamedQuery(name = "Owner.getOwner", query = "SELECT owner FROM Owner AS owner WHERE owner.name = :name"),
        @NamedQuery(name = "Owner.getByUsername", query = "SELECT owner FROM Owner AS owner WHERE owner.username = :username"),
        @NamedQuery(name = "Owner.getById", query = "SELECT owner FROM Owner AS owner WHERE owner.id = :id")
})
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true)
    private String username;
    @JsonIgnore
    private String password;
    @JsonIgnore
    private String salt;
    private String name;
    private String address;
    private String residence;
    private boolean usesWebsite;
    private String role;
    private boolean canEditPrice;

    @OneToMany
    private List<Invoice> invoices;

    @OneToMany
    private List<Car_Ownership> ownedCars;

    public Owner() {

    }

    public Owner(int id, String name, String address, String residence,
                 boolean usesWebsite, String role, boolean canEditPrice)
    {
        this.id = id;
        this.name = name;
        this.address = address;
        this.residence = residence;
        this.usesWebsite = usesWebsite;
        this.role = role;
        this.canEditPrice = canEditPrice;
        this.ownedCars = new ArrayList<>();
    }

    //region Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public boolean isUsesWebsite() {
        return usesWebsite;
    }

    public void setUsesWebsite(boolean usesWebsite) {
        this.usesWebsite = usesWebsite;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isCanEditPrice() {
        return canEditPrice;
    }

    public void setCanEditPrice(boolean canEditPrice) {
        this.canEditPrice = canEditPrice;
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<Invoice> invoices) {
        this.invoices = invoices;
    }

    public List<Car_Ownership> getOwnedCars() {
        return ownedCars;
    }

    public void setOwnedCars(List<Car_Ownership> ownedCars) {
        this.ownedCars = ownedCars;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    //endregion
}
