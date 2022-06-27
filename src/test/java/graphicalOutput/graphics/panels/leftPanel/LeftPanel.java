package graphicalOutput.graphics.panels.leftPanel;

import graphicsEngine.panels.PanelColors;
import graphicsEngine.panels.SimplePanel;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.awt.*;

public class LeftPanel extends SimplePanel {
    private static final PanelColors SECTION_COLORS;

    static {
        SECTION_COLORS = new PanelColors();
    }

    public LeftPanel(@Nullable PanelColors panelColors) {
        super(panelColors, false);
        setPreferredSize(new Dimension(
                Column1.WIDTH + Column2.WIDTH,
                Integer.MAX_VALUE));
        addParts();
    }

    private void addParts() {
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        add(new Column1(SECTION_COLORS));
        add(new Column2(SECTION_COLORS));
    }
}