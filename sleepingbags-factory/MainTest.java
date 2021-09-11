import interfaces.SleepingBag;
import utils.Constants;

public class MainTest {

    public static void main(String[] args) {
        SleepingBagFactory factory = new SleepingBagFactory();

        SleepingBag bag = factory.getSleepingBag(Constants.S_FOUR_WEATHER_RATINGS);

        bag.setSize(Constants.DOUBLE_SIZE);
        bag.setTemperatureRatings(Constants.EXTREME_TEMP_RATINGS);

        System.out.println("You ordered for the manufacture of a sleeping bag with the following features");
        System.out.println("bag purpose :: " + bag.getPurpose());
        System.out.println("bag size :: " + bag.getSize());
        System.out.println("bag weather ratings :: " + bag.getWeatherRatings());
        System.out.println("bag temperature ratings :: " + bag.getTemperatureRatings());

    }
}