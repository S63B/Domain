package com.S63B.domain.Entities;

import org.joda.time.DateTime;

import javax.persistence.*;

/**
 * Created by Nekkyou on 11-4-2017.
 */
@Entity
public class Car_Ownership {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@OneToOne
	private Car car;

	@OneToOne
	private Owner owner;

	private DateTime purchaseDate;

	public Car_Ownership() {
	}

	public Car_Ownership(Car car, Owner owner, DateTime purchaseDate) {
		this.car = car;
		this.owner = owner;
		this.purchaseDate = purchaseDate;
	}

	//region Getters and setters
	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public DateTime getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(DateTime purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	//endregion
}
