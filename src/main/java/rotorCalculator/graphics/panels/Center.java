package rotorCalculator.graphics.panels;

import graphicsEngine.panels.PanelColors;
import graphicsEngine.panels.SimplePanel;

import java.awt.*;

public class Center extends SimplePanel {
    public Center() {
        super(centerColors(), false);
    }

    private static PanelColors centerColors() {
        Color
                background = new Color(50, 80, 200),
                text = new Color(150, 120, 20),
                border = new Color(150, 0, 0);
        return new PanelColors(background, text, border);
    }
}