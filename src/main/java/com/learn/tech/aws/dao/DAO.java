package com.learn.tech.aws.dao;

import com.learn.tech.aws.models.CurrentWeather;
import com.learn.tech.aws.models.CurrentWeatherHourly;

public interface DAO {

	CurrentWeather getCurrentWeatherByZip();

	CurrentWeatherHourly getCurrentWeatherHourlyByZip();

}
