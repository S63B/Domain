package com.S63B.domain.Entities;

import com.S63B.domain.Enums;

import javax.persistence.*;

/**
 * Created by Nekkyou on 11-4-2017.
 */
@Entity
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@OneToOne
	private LicensePlate licensePlate;

	private Enums.EnergyLabel energyLabel;
	private boolean isStolen;

	//region Getters and Setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LicensePlate getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(LicensePlate licensePlate) {
		this.licensePlate = licensePlate;
	}

	public boolean isStolen() {
		return isStolen;
	}

	public void setStolen(boolean stolen) {
		isStolen = stolen;
	}

	public Enums.EnergyLabel getEnergyLabel() {
		return energyLabel;
	}

	public void setEnergyLabel(Enums.EnergyLabel energyLabel) {
		this.energyLabel = energyLabel;
	}

	//endregion
}
