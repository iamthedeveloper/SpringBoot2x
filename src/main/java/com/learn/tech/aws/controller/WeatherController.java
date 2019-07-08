package com.learn.tech.aws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.learn.tech.aws.models.CurrentWeather;
import com.learn.tech.aws.models.CurrentWeatherHourly;
import com.learn.tech.aws.service.WeatherService;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")

public class WeatherController {

	@Autowired
	private WeatherService service;

	@GetMapping("/currentWeather")
	@ResponseBody
	public CurrentWeather getCurrentWeatherByZip() {
		return service.getCurrentWeatherByZip();
	}

	@GetMapping("/currentWeatherByHourly")
	@ResponseBody
	public CurrentWeatherHourly getCurrentWeatherByHourly() {
		return service.getCurrentWeatherHourlyByZip();
	}
}