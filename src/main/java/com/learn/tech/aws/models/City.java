package com.learn.tech.aws.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class City {

	private int id;
	private String name;
	@JsonProperty("coord")
	private Coord coord;
	private String country;

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

	public Coord getCoOrd() {
		return coord;
	}

	public void setCoOrd(Coord coOrd) {
		this.coord = coOrd;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
