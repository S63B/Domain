package com.S63B.domain.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

/**
 * Created by Nekkyou on 6-6-2017.
 */
@Entity
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(unique = true)
	private String username;
	@JsonIgnore
	private String password;
}
