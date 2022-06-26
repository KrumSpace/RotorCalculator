package rotorCalculator.data.innerJointModel;

import rotorCalculator.data.RotationUtilities;

/**
 * A class containing rotational limits for inner joint.
 */
class Limits {
    //TODO: finish this
    protected Limits() {
        //
    }

    /**
     * Gets rotation period in seconds at given RPM.
     *
     * @param rpm Revolutions per minute
     *
     * @return rotation period in seconds at given RPM.
     */
    protected double getRotationPeriod(double rpm) {
        return RotationUtilities.getPeriodFromRPM(rpm);
    }

    /**
     * Gets angular velocity at given RPM.
     *
     * @param rpm Revolutions per minute
     *
     * @return Angular velocity in [rad / s].
     */
    protected double getOmega(double rpm) {
        return RotationUtilities.getAngularVelocityFromPeriod(getRotationPeriod(rpm));
    }
}