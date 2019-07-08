package com.learn.tech.aws.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.learn.tech.aws.models.hourly.Wind;
public class HourlyList {

	private int dt;
	@JsonProperty("main")
	private HourlyMain main;
	private List<Weather> weather;
	private Clouds clouds;
	private Wind wind;
	private Rain rain;
	private HourlySys sys;
	private String dt_txt;

	public int getDt() {
		return dt;
	}

	public void setDt(int dt) {
		this.dt = dt;
	}

	public HourlyMain getHourlyMain() {
		return main;
	}

	public void setHourlyMain(HourlyMain hourlyMain) {
		this.main = hourlyMain;
	}

	public List<Weather> getWeather() {
		return weather;
	}

	public void setWeather(List<Weather> weather) {
		this.weather = weather;
	}

	public Clouds getClouds() {
		return clouds;
	}

	public void setClouds(Clouds clouds) {
		this.clouds = clouds;
	}

	public Wind getWind() {
		return wind;
	}

	public void setWind(Wind wind) {
		this.wind = wind;
	}

	public Rain getRain() {
		return rain;
	}

	public void setRain(Rain rain) {
		this.rain = rain;
	}

	public HourlySys getSys() {
		return sys;
	}

	public void setSys(HourlySys sys) {
		this.sys = sys;
	}

	public String getDt_txt() {
		return dt_txt;
	}

	public void setDt_txt(String dt_txt) {
		this.dt_txt = dt_txt;
	}
}

class HourlySys {
	private String pod;

	public String getPod() {
		return pod;
	}

	public void setPod(String pod) {
		this.pod = pod;
	}
}

