package rotorCalculator.data.constants;

import org.jetbrains.annotations.Nullable;

import java.util.Objects;

// TODO: add javadoc
public class GeneralConstants {

    // physical constants

    public double standardGravity; // acceleration [m / s^2]

    public GeneralConstants() {
        this(null);
    }

    public GeneralConstants(@Nullable Environment environment) {
        setConstants_notNull();
        switch (nonNullEnvironment(environment)) {
            case MOON : {
                setConstants_moon();
                break;
            }
            case SI_STANDARD : {
                setConstants_si();
                break;
            }
            case ROUGH :
            default : {
                setConstants_rough();
            }
        }
    }

    private static Environment nonNullEnvironment(@Nullable Environment environment) {
        Environment defaultEnvironment = Environment.ROUGH;
        return Objects.requireNonNullElse(environment, defaultEnvironment);
    }

    private void setConstants_notNull() {
        standardGravity = 0;
    }

    private void setConstants_rough() {
        standardGravity = 9.8;
    }

    private void setConstants_si() {
        standardGravity = 9.80665;
    }

    private void setConstants_moon() {
        standardGravity = 1.62;
    }
}