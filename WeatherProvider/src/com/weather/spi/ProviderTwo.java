package com.weather.spi;

import edu.javacorse.lib.WeatherMethod;

public class ProviderTwo
{
    public void test34() {
    }

    public void superTest() {
    }
    
    @WeatherMethod
    public String weatherForCity(String city) {
        return "Proovider TWO:" + city;
    }
}
