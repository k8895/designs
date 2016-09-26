package com.wjk.test;

import com.wjk.observer.CurrentConditionsDisplay;
import com.wjk.subject.WeatherData;

public class Test {

	public static void main(String[] args) {
		final WeatherData weatherData = new WeatherData();

		//内部注册监听
		CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(weatherData);
		weatherData.setMeasurements(10.1f, 25.4f, 34.00f);

		//外部注册监听
		weatherData.registerObserver(new CurrentConditionsDisplay());
		weatherData.setMeasurements(111.1f, 125.4f, 34.24f);

	}

}
