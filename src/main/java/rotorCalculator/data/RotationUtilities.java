package rotorCalculator.data;

import rotorCalculator.data.constants.TimeConstants;

public class RotationUtilities {
    //converts period to omega
    public static double getAngularVelocityFromPeriod(double period) {
        return 2 * Math.PI / period;
    }

    //converts omega to period
    public static double getPeriodFromAngularVelocity(double angularVelocity) {
        return 2 * Math.PI / angularVelocity;
    }

    //converts period to RPM
    public static double getRPMFromPeriod(double period) {
        return TimeConstants.SECONDS_IN_MINUTE / period;
    }

    //converts RPM to period
    public static double getPeriodFromRPM(double rpm) {
        return TimeConstants.SECONDS_IN_MINUTE / rpm;
    }

    // gets the tangential velocity in [m/s] for given radius and angular velocity
    public static double getTangentialVelocity(double radius, double angularVelocity) {
        return radius * angularVelocity;
    }

    // gets angular velocity in [rad/s] for given radius and acceleration
    public static double getAngularVelocity(double radius, double acceleration) {
        return Math.sqrt(acceleration / radius);
    }
}