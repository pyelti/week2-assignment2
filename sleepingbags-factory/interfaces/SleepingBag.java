package interfaces;

public interface SleepingBag {
    void setWeatherRatings(String ratings);

    void setSize(String size);

    void setPurpose(String purpose);

    void setTemperatureRatings(String tmpRatings);

    String getPurpose();

    String getWeatherRatings();

    String getSize();

    String getTemperatureRatings();
}
