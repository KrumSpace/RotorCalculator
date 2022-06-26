package rotorCalculator.graphics.panels.leftPanel.sections;

import graphicsEngine.panels.PanelColors;
import org.jetbrains.annotations.Nullable;
import rotorCalculator.data.Data;

import javax.swing.*;
import java.awt.*;

import static graphicsEngine.Utilities.roundNumber;

public interface ParticularSections {

    // TODO: add javadoc
    class JointLimitSection extends AbstractSection {
        public static final int HEIGHT = 120;

        // TODO: add title: "Inner joint limits"

        public JointLimitSection(@Nullable PanelColors panelColors) {
            super(new int[] {Integer.MAX_VALUE, HEIGHT}, panelColors, true);
        }

        @Override
        public void addParts(JPanel p) {
            Color color = getPanelColors().text;
            p.add(new ReferenceRadiusLabel(color));
            p.add(new RPMLabel(color));
            p.add(new RotationalPeriodLabel(color));
            p.add(new MaxTangentialSpeedLabel(color));
            p.add(new AngularVelocityLabel(color));
        }

        private static class ReferenceRadiusLabel extends SectionLabel {
            protected ReferenceRadiusLabel(Color textColor) {
                super(textColor);
            }

            @Override
            public final String getText() {
                String label = "Reference radius: ";
                String value = roundNumber(Data.results.jointLimitResults.referenceRadius, 3);
                String units = " m";
                return label + value + units;
            }
        }

        private static class RPMLabel extends SectionLabel {
            protected RPMLabel(Color textColor) {
                super(textColor);
            }

            @Override
            public final String getText() {
                String label = "RPM: ";
                String value = roundNumber(Data.results.jointLimitResults.rpm, 2);
                String units = "";
                return label + value + units;
            }
        }

        private static class RotationalPeriodLabel extends SectionLabel {
            protected RotationalPeriodLabel(Color textColor) {
                super(textColor);
            }

            @Override
            public final String getText() {
                String label = "Rotational period: ";
                String value = roundNumber(Data.results.jointLimitResults.rotationalPeriod, 2);
                String units = " s";
                return label + value + units;
            }
        }

        private static class MaxTangentialSpeedLabel extends SectionLabel {
            protected MaxTangentialSpeedLabel(Color textColor) {
                super(textColor);
            }

            @Override
            public final String getText() {
                String label = "Max tangential speed: ";
                String value = roundNumber(Data.results.jointLimitResults.maxTangentialSpeed, 2);
                String units = " m/s";
                return label + value + units;
            }
        }

        private static class AngularVelocityLabel extends SectionLabel {
            protected AngularVelocityLabel(Color textColor) {
                super(textColor);
            }

            @Override
            public final String getText() {
                String label = "Angular velocity: ";
                String value = roundNumber(Data.results.jointLimitResults.angularVelocity, 3);
                String units = " rad/s";
                return label + value + units;
            }
        }
    }

    // TODO: add javadoc
    class CoriolisLimitSection extends AbstractSection {
        public static final int HEIGHT = 80;

        // TODO: add title: "Coriolis effect limits"

        public CoriolisLimitSection(@Nullable PanelColors panelColors) {
            super(new int[] {Integer.MAX_VALUE, HEIGHT}, panelColors, true);
        }

        @Override
        public void addParts(JPanel p) {
            Color color = getPanelColors().text;
            p.add(new MaxCoriolisEffectLabel(color));
            p.add(new ReferenceRunningSpeedLabel(color));
            p.add(new MaxAngularVelocityLabel(color));
        }

        private static class MaxCoriolisEffectLabel extends SectionLabel {
            protected MaxCoriolisEffectLabel(Color textColor) {
                super(textColor);
            }

            @Override
            public final String getText() {
                String label = "Max Coriolis effect: ";
                String value = roundNumber(Data.results.coriolisLimitResults.maxCoriolisEffect, 3);
                String units = " m/s^2";
                //TODO:
                // also display value in "gees":
                //      " (" + roundNumber(RotationalLimits.CoriolisLimits.MAX_CORIOLIS * 100, 2) + " %g)"
                return label + value + units;
            }
        }

        private static class ReferenceRunningSpeedLabel extends SectionLabel {
            protected ReferenceRunningSpeedLabel(Color textColor) {
                super(textColor);
            }

            @Override
            public final String getText() {
                String label = "Reference running speed: ";
                String value = roundNumber(Data.results.coriolisLimitResults.referenceRunningSpeed, 1);
                String units = " m/s";
                return label + value + units;
            }
        }

        private static class MaxAngularVelocityLabel extends SectionLabel {
            protected MaxAngularVelocityLabel(Color textColor) {
                super(textColor);
            }

            @Override
            public final String getText() {
                String label = "Maximum angular velocity: ";
                String value = roundNumber(Data.results.coriolisLimitResults.maxAngularVelocity, 3);
                String units = " rad/s";
                return label + value + units;
            }
        }
    }

    // TODO: add javadoc
    class TotalOmegaLimitSection extends AbstractSection {
        public static final int HEIGHT = 40;

        //TODO: set no title

        public TotalOmegaLimitSection(@Nullable PanelColors panelColors) {
            super(new int[] {Integer.MAX_VALUE, HEIGHT}, panelColors, true);
        }

        @Override
        public void addParts(JPanel p) {
            Color color = getPanelColors().text;
            p.add(new FinalMaxAngularVelocityLabel(color));
        }

        private static class FinalMaxAngularVelocityLabel extends SectionLabel {
            protected FinalMaxAngularVelocityLabel(Color textColor) {
                super(textColor);
            }

            @Override
            public final String getText() {
                String label = "Final maximum angular velocity: ";
                String value = roundNumber(Data.results.totalOmegaLimitResults.finalMaxAngularVelocity, 3);
                String units = " rad/s";
                return label + value + units;
            }
        }
    }

    // TODO: add javadoc
    class GravityRequirementSection extends AbstractSection {
        public static final int HEIGHT = 80;

        // TODO: add title: "Standard gravity requirements"

        public GravityRequirementSection(@Nullable PanelColors panelColors) {
            super(new int[] {Integer.MAX_VALUE, HEIGHT}, panelColors, true);
        }

        @Override
        public void addParts(JPanel p) {
            Color color = getPanelColors().text;
            p.add(new GForceLabel(color));
            p.add(new AccelerationLabel(color));
            p.add(new MinimumRadiusLabel(color));
        }

        private static class GForceLabel extends SectionLabel {
            protected GForceLabel(Color textColor) {
                super(textColor);
            }

            @Override
            public final String getText() {
                String label = "G-force: ";
                String value = roundNumber(Data.results.gravityRequirementResults.gForce, 2);
                String units = " G";
                return label + value + units;
            }
        }

        private static class AccelerationLabel extends SectionLabel {
            protected AccelerationLabel(Color textColor) {
                super(textColor);
            }

            @Override
            public final String getText() {
                String label = "Acceleration: ";
                String value = roundNumber(Data.results.gravityRequirementResults.acceleration, 3);
                String units = " m/s^2";
                return label + value + units;
            }
        }

        private static class MinimumRadiusLabel extends SectionLabel {
            protected MinimumRadiusLabel(Color textColor) {
                super(textColor);
            }

            @Override
            public final String getText() {
                String label = "Minimum rotor radius: ";
                String value = roundNumber(Data.results.gravityRequirementResults.minimumRadius, 3);
                String units = " m";
                return label + value + units;
            }
        }
    }

    // TODO: add javadoc
    class GradientLimitSection extends AbstractSection {
        public static final int HEIGHT = 80;

        // TODO: add title: "Force gradient limits"

        public GradientLimitSection(@Nullable PanelColors panelColors) {
            super(new int[] {Integer.MAX_VALUE, HEIGHT}, panelColors, true);
        }

        @Override
        public void addParts(JPanel p) {
            Color color = getPanelColors().text;
            p.add(new GradientLabel(color));
            p.add(new ReferenceHeightLabel(color));
            p.add(new MinimumRadiusLabel(color));
        }

        private static class GradientLabel extends SectionLabel {
            protected GradientLabel(Color textColor) {
                super(textColor);
            }

            @Override
            public final String getText() {
                String label = "Gradient: ";
                String value = roundNumber(Data.results.gradientLimitResults.gradient * 100, 2);
                String units = " %";
                return label + value + units;
            }
        }

        private static class ReferenceHeightLabel extends SectionLabel {
            protected ReferenceHeightLabel(Color textColor) {
                super(textColor);
            }

            @Override
            public final String getText() {
                String label = "Reference height: ";
                String value = roundNumber(Data.results.gradientLimitResults.referenceHeight, 2);
                String units = " m";
                return label + value + units;
            }
        }

        private static class MinimumRadiusLabel extends SectionLabel {
            protected MinimumRadiusLabel(Color textColor) {
                super(textColor);
            }

            @Override
            public final String getText() {
                String label = "Minimum rotor radius: ";
                String value = roundNumber(Data.results.gradientLimitResults.minimumRadius, 3);
                String units = " m";
                return label + value + units;
            }
        }
    }

    // TODO: add javadoc
    class TotalRadiusLimitSection extends AbstractSection {
        public static final int HEIGHT = 40;

        // TODO: set no title

        public TotalRadiusLimitSection(@Nullable PanelColors panelColors) {
            super(new int[] {Integer.MAX_VALUE, HEIGHT}, panelColors, true);
        }

        @Override
        public void addParts(JPanel p) {
            Color color = getPanelColors().text;
            p.add(new FinalMinimumRadiusLabel(color));
        }

        private static class FinalMinimumRadiusLabel extends SectionLabel {
            protected FinalMinimumRadiusLabel(Color textColor) {
                super(textColor);
            }

            @Override
            public final String getText() {
                String label = "Final minimum rotor radius: ";
                String value = roundNumber(Data.results.totalRadiusLimitResults.finalMinimumRadius, 3);
                String units = " m";
                return label + value + units;
            }
        }
    }

    // TODO: add javadoc
    class ActualParameterSection extends AbstractSection {
        public static final int HEIGHT = 120;

        // TODO: add title: "Actual values for selected rotor"

        public ActualParameterSection(@Nullable PanelColors panelColors) {
            super(new int[] {Integer.MAX_VALUE, HEIGHT}, panelColors, true);
        }

        @Override
        public void addParts(JPanel p) {
            Color color = getPanelColors().text;
            p.add(new RadiusLabel(color));
            p.add(new AngularVelocityLabel(color));
            p.add(new RotationalPeriodLabel(color));
            p.add(new RPMLabel(color));
            p.add(new TangentialVelocityLabel(color));
        }

        private static class RadiusLabel extends SectionLabel {
            protected RadiusLabel(Color textColor) {
                super(textColor);
            }

            @Override
            public final String getText() {
                String label = "Radius: ";
                String value = roundNumber(Data.results.actualParameterResults.radius, 3);
                String units = " m";
                return label + value + units;
            }
        }

        private static class AngularVelocityLabel extends SectionLabel {
            protected AngularVelocityLabel(Color textColor) {
                super(textColor);
            }

            @Override
            public final String getText() {
                String label = "Angular velocity: ";
                String value = roundNumber(Data.results.actualParameterResults.angularVelocity, 3);
                String units = " rad/s";
                return label + value + units;
            }
        }

        private static class RotationalPeriodLabel extends SectionLabel {
            protected RotationalPeriodLabel(Color textColor) {
                super(textColor);
            }

            @Override
            public final String getText() {
                String label = "Rotational period: ";
                String value = roundNumber(Data.results.actualParameterResults.rotationalPeriod, 2);
                String units = " s";
                return label + value + units;
            }
        }

        private static class RPMLabel extends SectionLabel {
            protected RPMLabel(Color textColor) {
                super(textColor);
            }

            @Override
            public final String getText() {
                String label = "RPM: ";
                String value = roundNumber(Data.results.actualParameterResults.rpm, 2);
                String units = "";
                return label + value + units;
            }
        }

        private static class TangentialVelocityLabel extends SectionLabel {
            protected TangentialVelocityLabel(Color textColor) {
                super(textColor);
            }

            @Override
            public final String getText() {
                String label = "Tangential velocity: ";
                String value = roundNumber(Data.results.actualParameterResults.tangentialVelocity, 1);
                //Rotor.getTangentialVelocity(radius, omega)
                String units = " m/s";
                return label + value + units;
            }
        }
    }
}