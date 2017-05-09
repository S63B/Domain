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
	private Owner user;

	private DateTime purchaseDate;

	public Car_Ownership() {
	}

	public Car_Ownership(Car car, Owner user, DateTime purchaseDate) {
		this.car = car;
		this.user = user;
		this.purchaseDate = purchaseDate;
	}

	//region Getters and setters
	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Owner getUser() {
		return user;
	}

	public void setUser(Owner user) {
		this.user = user;
	}

	public DateTime getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(DateTime purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	//endregion
}
