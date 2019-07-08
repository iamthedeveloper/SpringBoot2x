package com.learn.tech.aws.models;

public class Wind {

	float speed;

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	public int getDeg() {
		return deg;
	}

	public void setDeg(int deg) {
		this.deg = deg;
	}

	public float getGust() {
		return gust;
	}

	public void setGust(float gust) {
		this.gust = gust;
	}

	int deg;
	float gust;
}
