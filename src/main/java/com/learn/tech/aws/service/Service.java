package com.learn.tech.aws.service;

import com.learn.tech.aws.models.CurrentWeather;
import com.learn.tech.aws.models.CurrentWeatherHourly;

public interface Service {

	CurrentWeather getCurrentWeatherByZip();

	CurrentWeatherHourly getCurrentWeatherHourlyByZip();

}
