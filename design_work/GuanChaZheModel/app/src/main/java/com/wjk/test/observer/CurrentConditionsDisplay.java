package com.wjk.test.observer;

import com.wjk.test.imp.DisplayElement;
import com.wjk.test.imp.Observer;
import com.wjk.test.imp.Subject;
import com.wjk.test.subject.WeatherData;

/**
 * Created by WJK on 2016/9/8.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private Subject weatherData;
    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentConditionsDisplay(){

    }

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void updata(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("当前值：" + temperature + "--" + humidity + "--" + pressure);
    }
}
