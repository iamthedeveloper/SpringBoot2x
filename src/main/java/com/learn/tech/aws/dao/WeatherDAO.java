package com.learn.tech.aws.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.learn.tech.aws.models.CurrentWeather;
import com.learn.tech.aws.models.CurrentWeatherHourly;

@Component
public class WeatherDAO implements DAO {

//	@Value("${currentWeatherByZip}")
//	private String urlByZipCode;

	@Value("${end_point_url}")
	private String endPoint;

	@Value("${weather}")
	private String weather;

	@Value("${by_zip}")
	private String byZip;

	@Value("${country}")
	private String country;

	@Value("${app_id}")
	private String appId;
	
	@Value("${forecast}")
	private String forecast;
	
	

	@Override
	public CurrentWeather getCurrentWeatherByZip() {
		RestTemplate restTemplate = new RestTemplate();
		String urlByZip = endPoint + weather + byZip + country + appId;
		CurrentWeather weatherbyZip = restTemplate.getForObject(urlByZip, CurrentWeather.class);
		//System.out.println("urlByZip : "+ urlByZip);
		return weatherbyZip;
	}

	@Override
	public CurrentWeatherHourly getCurrentWeatherHourlyByZip() {
		RestTemplate restTemplate = new RestTemplate();
		String hourlyUrlByZip = endPoint + forecast + "?" +  byZip + country + appId;
		//String hourlyUrlByZip = "https://samples.openweathermap.org/data/2.5/forecast/hourly?zip=94040&appid=2c96febe80a38116f3a23c4d1563bc3f";
		//System.out.println("hourlyUrlByZip: "+hourlyUrlByZip);
		CurrentWeatherHourly weatherbyZip = restTemplate.getForObject(hourlyUrlByZip, CurrentWeatherHourly.class);
		return weatherbyZip;
	}

}
