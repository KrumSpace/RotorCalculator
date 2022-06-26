package rotorCalculator.data.innerJointModel;

import rotorCalculator.data.RotationUtilities;

public class InnerJoint {
    public double
            radius, // radius of the joint, [m]
            maxRPM; // max revolutions per minute for inner rotating joint
    private Limits limits;

    public InnerJoint() {
        radius = 5.00;
        maxRPM = 2.00;

        limits = new Limits();
    }

    /**
     * Gets rotation period in seconds at max RPM.
     *
     * @return Rotation period in [ s ].
     */
    public double getRotationPeriod() {
        return limits.getRotationPeriod(maxRPM);
    }

    /**
     * Gets the maximum angular velocity of the joint.
     *
     * @return Angular velocity in [rad / s].
     */
    public double getAngularVelocity() {
        return RotationUtilities.getAngularVelocityFromPeriod(getRotationPeriod());
    }

    /**
     * Gets the maximum tangential velocity for the joint at maximum RPM and radius.
     *
     * @return Tangential velocity in [m / s].
     */
    public double getTangentialVelocity() {
        return RotationUtilities.getTangentialVelocity(radius, getAngularVelocity());
    }
}