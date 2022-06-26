package rotorCalculator.humanModel;

import rotorCalculator.data.Data;

// TODO: add javadoc
public class RotationalLimits {
    public GradientLimits gradientLimits;
    public CoriolisLimits coriolisLimits;

    protected RotationalLimits(double maxForceGradient, double maxCoriolisEffect) {
        gradientLimits = new GradientLimits(maxForceGradient);
        coriolisLimits = new CoriolisLimits(maxCoriolisEffect);
    }

    // TODO: add javadoc
    public static class GradientLimits {
        // difference of force between top and bottom as a fraction
        private double maxGradient;

        protected GradientLimits(double gradient) {
            setMaxGradient(gradient);
        }

        protected void setMaxGradient(double gradient) {
            maxGradient = gradient;
        }

        //usable for output
        public double getMaxGradient() {
            return maxGradient;
        }

        /**
         * Gets minimum radius for max force gradient and given height.
         *
         * @param height Reference height in [m].
         *
         * @return Minimum radius in [m].
         */
        public double getRadius(double height) {
            return height / maxGradient;
        }
    }

    // TODO: add javadoc
    public static class CoriolisLimits {
        // maximum permissible sideways acceleration due to Coriolis effect [number of g's]
        private double maxCoriolis;

        protected CoriolisLimits(double maxCoriolis) {
            setMaxCoriolis(maxCoriolis);
        }

        protected void setMaxCoriolis(double maxCoriolis) {
            this.maxCoriolis = maxCoriolis;
        }

        public double getMaxCoriolis() {
            return maxCoriolis;
        }

        /**
         * Gets maximum coriolis effect for given angular velocity and running speed.
         *
         * @param omega Angular velocity in [rad / s].
         * @param velocity Velocity in [m / s].
         *
         * @return Coriolis effect (acceleration in [m / s^2]).
         */
        public double getCoriolis(double omega, double velocity) {
            return 2 * velocity * omega;
        }

        /**
         * Gets maximum angular velocity (omega) for maximum coriolis effect at given running speed.
         *
         * @param velocity Running speed in [m / s].
         *
         * @return Maximum angular velocity in [rad / s].
         */
        public double getMaxOmega(double velocity) {
            double g = Data.generalConstants.standardGravity;
            return (maxCoriolis * g) / (2 * velocity);
        }
    }
}