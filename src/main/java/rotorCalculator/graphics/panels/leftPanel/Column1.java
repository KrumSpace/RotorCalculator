package rotorCalculator.graphics.panels.leftPanel;

import graphicsEngine.panels.PanelColors;
import org.jetbrains.annotations.Nullable;
import rotorCalculator.graphics.panels.leftPanel.sections.ParticularSections;

import javax.swing.*;

public class Column1 extends AbstractColumn {
    public static final int WIDTH = 250;

    protected Column1(@Nullable PanelColors panelColors) {
        super(WIDTH, panelColors, true);
    }

    @Override
    public void addParts(JPanel p) {
        PanelColors colors = getPanelColors();
        p.add(new ParticularSections.JointLimitSection(colors));
        p.add(new ParticularSections.CoriolisLimitSection(colors));
        p.add(new ParticularSections.TotalOmegaLimitSection(colors));
        p.add(new ParticularSections.GravityRequirementSection(colors));
        p.add(new ParticularSections.GradientLimitSection(colors));
        p.add(new ParticularSections.TotalRadiusLimitSection(colors));
    }
}