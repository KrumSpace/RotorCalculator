package rotorCalculator.data.rotorModel;

import rotorCalculator.data.Data;
import rotorCalculator.data.RotationUtilities;
import rotorCalculator.data.innerJointModel.InnerJoint;
import rotorCalculator.humanModel.HumanModel;

/**
 * Calculates the size of a rotating living habitat for living in a weightless environment.
 *
 * TODO: finish this and add javadoc
 */
public class Rotor {
    public InnerJoint innerJoint;
    public HumanModel referenceHuman;

    public Rotor() {
        innerJoint = new InnerJoint();
        referenceHuman = new HumanModel();
    }

    // gets maximum angular velocity (omega) from inner joint limits and maximum coriolis effect
    public double getAngularVelocityLimit() {
        double maxOmega_fromInnerJoint =
                innerJoint.getAngularVelocity();
        double maxOmega_fromCoriolis =
                referenceHuman.rotationalLimits.coriolisLimits.getMaxOmega(
                        referenceHuman.maxRunningSpeed);

        return Math.min(
                maxOmega_fromInnerJoint,
                maxOmega_fromCoriolis);
    }

    public double getRadiusFromGravity() {
        double omegaLimit = getAngularVelocityLimit();
        return Data.getGravity() / Math.pow(omegaLimit, 2);
    }

    // gets minimum radius for maximum gradient and maximum angular velocity (omega) at reference gravity
    public double getRadiusLimit() {
        double minRadius_fromGradient =
                referenceHuman.rotationalLimits.gradientLimits.getRadius(
                        referenceHuman.height);
        double minRadius_fromStandardGravity = getRadiusFromGravity();

        return Math.max(
                minRadius_fromGradient,
                minRadius_fromStandardGravity);
    }

    // gets angular velocity for given radius and constant reference acceleration
    public static double getAngularVelocity(double radius) {
        return RotationUtilities.getAngularVelocity(radius, Data.getGravity());
    }
}