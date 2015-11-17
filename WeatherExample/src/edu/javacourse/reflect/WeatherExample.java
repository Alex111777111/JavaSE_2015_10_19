package edu.javacourse.reflect;

import edu.javacorse.lib.WeatherMethod;
import java.lang.reflect.Method;

public class WeatherExample
{

    public static void main(String[] args) {
        WeatherExample we = new WeatherExample();
        String answer = we.getWeather("com.weather.spi.ProviderTwo", "Saint-Petersburg");
        System.out.println(answer);
    }
    
    public String getWeather(String className, String city) {
        String weather = "";
        Method weatherMethod = null;
        try {
            Class cl = Class.forName(className);
            Method[] methods = cl.getMethods();
            for(Method m : methods) {
                Object obj = m.getAnnotation(WeatherMethod.class);
                if(obj != null) {
                    weatherMethod = m;
                    break;
                }
            }
            if(weatherMethod != null) {
                Object wo = cl.newInstance();
                weather = (String)weatherMethod.invoke(wo, city);
            }
        } catch (Exception ex) {
        }
        return weather;
    }
    
}
