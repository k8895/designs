package com.wjk.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.wjk.test.observer.CurrentConditionsDisplay;
import com.wjk.test.subject.WeatherData;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final WeatherData weatherData=new WeatherData();

        //内部注册监听
        CurrentConditionsDisplay ccd=new CurrentConditionsDisplay(weatherData);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weatherData.setMeasurements(10.1f,25.4f,34.00f);
            }
        });

        //外部注册监听
        weatherData.registerObserver(new CurrentConditionsDisplay());
        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weatherData.setMeasurements(111.1f,125.4f,34.24f);
            }
        });
    }
}
