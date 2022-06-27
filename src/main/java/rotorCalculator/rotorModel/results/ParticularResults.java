package rotorCalculator.rotorModel.results;

import rotorCalculator.Data;
import rotationUtilities.RotationUtilities;
import humanModel.HumanModel;
import humanModel.RotationalLimits;

//TODO: finish this
public interface ParticularResults {
    //

    double DEFAULT_DOUBLE = 1.234567d;

    //
    abstract class AbstractResults {
        //

        //
        protected AbstractResults() {
            //
        }

        //
    }

    //Inner joint limits
    class JointLimitResults extends AbstractResults {
        public double
                maxTangentialSpeed,
                referenceRadius,
                rotationalPeriod,
                rpm,
                angularVelocity;

        //sets default values
        JointLimitResults() {
            maxTangentialSpeed = DEFAULT_DOUBLE;
            referenceRadius = DEFAULT_DOUBLE;
            rotationalPeriod = DEFAULT_DOUBLE;
            rpm = DEFAULT_DOUBLE;
            angularVelocity = DEFAULT_DOUBLE;
        }

        public void setResults() {
            maxTangentialSpeed = Data.rotor.innerJoint.getTangentialVelocity();
            referenceRadius = Data.rotor.innerJoint.radius;
            rotationalPeriod = Data.rotor.innerJoint.getRotationPeriod();
            rpm = Data.rotor.innerJoint.maxRPM;
            angularVelocity = Data.rotor.innerJoint.getAngularVelocity();
        }
    }

    //Coriolis effect limits
    class CoriolisLimitResults extends AbstractResults {
        public double
                maxCoriolisEffect,
                referenceRunningSpeed,
                maxAngularVelocity;

        //sets default values
        CoriolisLimitResults() {
            maxCoriolisEffect = DEFAULT_DOUBLE;
            referenceRunningSpeed = DEFAULT_DOUBLE;
            maxAngularVelocity = DEFAULT_DOUBLE;
        }

        public void setResults() {
            HumanModel human = Data.rotor.referenceHuman;
            RotationalLimits.CoriolisLimits coriolisLimits = human.rotationalLimits.coriolisLimits;
            double runningSpeed = human.maxRunningSpeed;
            maxCoriolisEffect = coriolisLimits.getMaxCoriolis();
            referenceRunningSpeed = runningSpeed;
            maxAngularVelocity = coriolisLimits.getMaxOmega(runningSpeed);
        }
    }

    //
    class TotalOmegaLimitResults extends AbstractResults {
        public double finalMaxAngularVelocity;

        //sets default values
        TotalOmegaLimitResults() {
            finalMaxAngularVelocity = DEFAULT_DOUBLE;
        }

        public void setResults() {
            finalMaxAngularVelocity = Data.rotor.getAngularVelocityLimit();
        }
    }

    //
    class GravityRequirementResults extends AbstractResults {
        public double
                gForce,
                acceleration,
                minimumRadius;

        //sets default values
        GravityRequirementResults() {
            gForce = DEFAULT_DOUBLE;
            acceleration = DEFAULT_DOUBLE;
            minimumRadius = DEFAULT_DOUBLE;
        }

        public void setResults() {
            gForce = Data.preferences.gForce;
            acceleration = Data.generalConstants.standardGravity;
            minimumRadius = Data.rotor.getRadiusFromGravity();
        }
    }

    //
    class GradientLimitResults extends AbstractResults {
        public double
                gradient,
                referenceHeight,
                minimumRadius;

        //sets default values
        GradientLimitResults() {
            gradient = DEFAULT_DOUBLE;
            referenceHeight = DEFAULT_DOUBLE;
            minimumRadius = DEFAULT_DOUBLE;
        }

        public void setResults() {
            HumanModel human = Data.rotor.referenceHuman;
            gradient = human.rotationalLimits.gradientLimits.getMaxGradient();
            referenceHeight = human.height;
            minimumRadius = human.rotationalLimits.gradientLimits.getRadius(human.height);
        }
    }

    //
    class TotalRadiusLimitResults extends AbstractResults {
        public double finalMinimumRadius;

        //sets default values
        TotalRadiusLimitResults() {
            finalMinimumRadius = DEFAULT_DOUBLE;
        }

        public void setResults() {
            finalMinimumRadius = Data.rotor.getRadiusLimit();
        }
    }

    //
    class ActualParameterResults extends AbstractResults {
        public double
                radius,
                angularVelocity,
                rpm,
                rotationalPeriod,
                tangentialVelocity;

        //sets default values
        ActualParameterResults() {
            radius = DEFAULT_DOUBLE;
            angularVelocity = DEFAULT_DOUBLE;
            rpm = DEFAULT_DOUBLE;
            rotationalPeriod = DEFAULT_DOUBLE;
            tangentialVelocity = DEFAULT_DOUBLE;
        }

        public void setResults() {
            radius = Data.rotor.getRadiusLimit();
            angularVelocity = RotationUtilities.getAngularVelocity(radius, Data.getGravity());
            rotationalPeriod = RotationUtilities.getPeriodFromAngularVelocity(angularVelocity);
            rpm = RotationUtilities.getRPMFromPeriod(rotationalPeriod);
            tangentialVelocity = RotationUtilities.getTangentialVelocity(radius, angularVelocity);
        }
    }
}