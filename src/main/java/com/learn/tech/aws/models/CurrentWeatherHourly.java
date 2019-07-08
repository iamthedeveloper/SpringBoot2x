package com.learn.tech.aws.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CurrentWeatherHourly {

	private String cod;
	private float message;
	private int cnt;
	
	@JsonProperty("list")
	private List<HourlyList> hourlyList;
	
	@JsonProperty("city")
	private City city;
	
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public float getMessage() {
		return message;
	}
	public void setMessage(float message) {
		this.message = message;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public List<HourlyList> getHourlyList() {
		return hourlyList;
	}
	public void setHourlyList(List<HourlyList> hourlyList) {
		this.hourlyList = hourlyList;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
}
