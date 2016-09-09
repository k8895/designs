package com.wjk.test.subject;

import com.wjk.test.imp.Observer;
import com.wjk.test.imp.Subject;

import java.util.ArrayList;

/**
 * Created by WJK on 2016/9/8.
 */
public class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers=new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).updata(temperature,humidity,pressure);
        }
    }

    private void measurementsChange(){
        notifyObserver();
    }

    //获取信息赋值，并将信息发送给观察者
    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementsChange();
    }

}
