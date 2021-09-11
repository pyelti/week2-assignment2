package models;

import interfaces.SleepingBag;
import utils.Constants;

public class SleepingBagFour implements SleepingBag {
    private String purpose;
    private String weatherRatings;
    private String size;
    private String temperatureRatings;

    public SleepingBagFour() {
        this.weatherRatings = Constants.S_FOUR_WEATHER_RATINGS;
        this.purpose = Constants.ULS_PURPOSE;
    }

    @Override
    public void setWeatherRatings(String r) {
        this.weatherRatings = r;

    }

    @Override
    public void setSize(String s) {
        this.size = s;

    }

    @Override
    public void setPurpose(String pup) {
        this.purpose = pup;

    }

    @Override
    public void setTemperatureRatings(String t) {
        this.temperatureRatings = t;
    }

    @Override
    public String getPurpose() {
        return this.purpose;
    }

    @Override
    public String getWeatherRatings() {
        return this.weatherRatings;
    }

    @Override
    public String getSize() {
        return this.size;
    }

    @Override
    public String getTemperatureRatings() {
        return this.temperatureRatings;
    }

}
