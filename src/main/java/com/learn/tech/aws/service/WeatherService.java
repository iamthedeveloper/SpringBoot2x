package com.learn.tech.aws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.learn.tech.aws.dao.DAO;
import com.learn.tech.aws.models.CurrentWeather;
import com.learn.tech.aws.models.CurrentWeatherHourly;

@Component(value = "WeatherService")
public class WeatherService implements Service {

	@Autowired
	private DAO dao;

	@Override
	public CurrentWeather getCurrentWeatherByZip() {
		return dao.getCurrentWeatherByZip();
	}

	//5 Days and 3 hours Forecast
	@Override
	public CurrentWeatherHourly getCurrentWeatherHourlyByZip() {
		return dao.getCurrentWeatherHourlyByZip();
	}

}