package com.weather.spi;

import edu.javacorse.lib.WeatherMethod;

public class ProviderOne
{
    @WeatherMethod
    public String getWeather(String city) {
        return "Provider ONE:" + city;
    }
    
    public void test1() {
    }
    
    public void test2() {
    }
}
