package BehavioralDesignPatterns.ObserverDesignPatterns.WeatherData;

public class WeatherData extends EventManager{

    private float temperature;
    private float pressure;
    private float humidity;

    public WeatherData(){
        
    }
    
    public WeatherData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        weatherChange();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        weatherChange();
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
        weatherChange();
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
        weatherChange();
    }

    public void weatherChange(){
        notifyObservers();
    }
}
