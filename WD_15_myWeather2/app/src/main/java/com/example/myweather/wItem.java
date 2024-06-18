package com.example.myweather;

public class wItem {
    private String city;
    private String temperature;
    private String feelsLike;
    private String tempMax;
    private String tempMin;
    private String pressure;
    private String humidity;

    public wItem(String city, String temperature, String feelsLike, String tempMax, String tempMin, String pressure, String humidity) {
        this.city = city;
        this.temperature = temperature;
        this.feelsLike = feelsLike;
        this.tempMax = tempMax;
        this.tempMin = tempMin;
        this.pressure = pressure;
        this.humidity = humidity;
    }

    // Getters and setters
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getTemperature() { return temperature; }
    public void setTemperature(String temperature) { this.temperature = temperature; }

    public String getFeelsLike() { return feelsLike; }
    public void setFeelsLike(String feelsLike) { this.feelsLike = feelsLike; }

    public String getTempMax() { return tempMax; }
    public void setTempMax(String tempMax) { this.tempMax = tempMax; }

    public String getTempMin() { return tempMin; }
    public void setTempMin(String tempMin) { this.tempMin = tempMin; }

    public String getPressure() { return pressure; }
    public void setPressure(String pressure) { this.pressure = pressure; }

    public String getHumidity() { return humidity; }
    public void setHumidity(String humidity) { this.humidity = humidity; }

    // Additional methods for utility

    @Override
    public String toString() {
        return "wItem{" +
                "city='" + city + '\'' +
                ", temperature='" + temperature + '\'' +
                ", feelsLike='" + feelsLike + '\'' +
                ", tempMax='" + tempMax + '\'' +
                ", tempMin='" + tempMin + '\'' +
                ", pressure='" + pressure + '\'' +
                ", humidity='" + humidity + '\'' +
                '}';
    }
}
