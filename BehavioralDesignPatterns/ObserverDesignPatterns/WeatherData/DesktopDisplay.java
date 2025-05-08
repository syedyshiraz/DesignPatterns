package BehavioralDesignPatterns.ObserverDesignPatterns.WeatherData;

public class DesktopDisplay implements IObserver{
    
    private float temperature;
    private float pressure;
    private float humidity;

    private WeatherData weatherData;

    public DesktopDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.addObserver(this);
        update();
    }


    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        this.pressure = weatherData.getPressure();
        System.out.println("From PhoneDisplay: [temperature=" + temperature + ", pressure=" + pressure + ", humidity=" + humidity + "]");
    }

}
