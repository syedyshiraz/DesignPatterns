package BehavioralDesignPatterns.ObserverDesignPatterns.WeatherData;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        PhoneDisplay phoneDisplay = new PhoneDisplay(weatherData);
        
        weatherData.setTemperature(12);
        weatherData.setHumidity(17);
        weatherData.setPressure(20);

        System.out.println(phoneDisplay);
    }
}
