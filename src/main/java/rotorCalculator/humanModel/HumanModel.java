package rotorCalculator.humanModel;

//TODO: add javadoc
public class HumanModel {
    private static final double DEFAULT_HEIGHT = 1.80; // average human height [m], somewhat arbitrary number
    private static final double DEFAULT_RUNNING_SPEED = 10; // average maximum running speed [m/s], somewhat arbitrary number

    public double height;
    public double maxRunningSpeed;

    public RotationalLimits rotationalLimits;

    public HumanModel() {
        height = DEFAULT_HEIGHT;
        maxRunningSpeed = DEFAULT_RUNNING_SPEED;

        setRotationalLimits();
    }

    private void setRotationalLimits() {
        double maxForceGradient = 0.05; // arbitrary number, corresponding to 5%
        double maxCoriolisEffect = 0.20; // arbitrary number, corresponding to 20%

        rotationalLimits = new RotationalLimits(maxForceGradient, maxCoriolisEffect);
    }
}