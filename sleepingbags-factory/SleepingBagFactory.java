import interfaces.SleepingBag;
import models.SleepingBagFour;
import models.SleepingBagOne;
import models.SleepingBagThree;
import models.SleepingBagTwo;
import utils.Constants;

public class SleepingBagFactory {

    public SleepingBag getSleepingBag(String season) {
        switch (season) {
            case Constants.S_ONE_WEATHER_RATINGS:
                return new SleepingBagOne();
            case Constants.S_TWO_WEATHER_RATINGS:
                return new SleepingBagTwo();
            case Constants.S_THREE_WEATHER_RATINGS:
                return new SleepingBagThree();
            case Constants.S_FOUR_WEATHER_RATINGS:
                return new SleepingBagFour();
            default:
                return null;
        }
    }
}
