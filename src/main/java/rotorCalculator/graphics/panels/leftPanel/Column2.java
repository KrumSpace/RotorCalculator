package rotorCalculator.graphics.panels.leftPanel;

import graphicsEngine.panels.PanelColors;
import org.jetbrains.annotations.Nullable;
import rotorCalculator.graphics.panels.leftPanel.sections.ParticularSections;

import javax.swing.*;

public class Column2 extends AbstractColumn {
    public static final int WIDTH = 250;

    protected Column2(@Nullable PanelColors panelColors) {
        super(WIDTH, panelColors, true);
    }

    @Override
    public void addParts(JPanel p) {
        PanelColors colors = getPanelColors();
        p.add(new ParticularSections.ActualParameterSection(colors));
    }
}