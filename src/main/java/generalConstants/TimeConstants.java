package generalConstants;

import java.util.Objects;

import org.jetbrains.annotations.Nullable;

/**
 * A class for containing general constants.
 */
public class TimeConstants {

    // time unit conversion constants

    public static final int
            SECONDS_IN_MINUTE = 60,
            MINUTES_IN_HOUR = 60;

    public double hoursInDay;

    public TimeConstants(@Nullable Environment environment) {
        switch (Objects.requireNonNullElse(environment, Environment.ROUGH)) {
            case SI_STANDARD : {
                hoursInDay = 23 + (56 + 4.0910 / SECONDS_IN_MINUTE) / MINUTES_IN_HOUR;
                break;
            }
            case MOON : {
                hoursInDay = 29.53 * 24.00;
                break;
            }
            case ROUGH :
            default : {
                hoursInDay = 24.00;
            }
        }
    }
}