package rotorCalculator.graphics.panels.leftPanel.sections;

import graphicsEngine.Utilities;
import graphicsEngine.parts.SimpleLabel;

import java.awt.*;

public class SectionLabel extends SimpleLabel {
    protected static final int HEIGHT = 20;
    private static final int WIDTH = Integer.MAX_VALUE;

    public SectionLabel(Color textColor) {
        this(textColor, false, null);
    }

    public SectionLabel(Color textColor, boolean border, Color borderColor) {
        super(null, textColor);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setAlignmentX(Component.LEFT_ALIGNMENT);

        Utilities.BorderInterface.setBorderState(
                this,
                border,
                borderColor);
    }

    @Override
    public Dimension getMaximumSize() {
        Dimension size = getPreferredSize();
        size.width = WIDTH;
        return size;
    }
}