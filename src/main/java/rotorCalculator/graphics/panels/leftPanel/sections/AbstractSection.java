package rotorCalculator.graphics.panels.leftPanel.sections;

import graphicsEngine.panels.PanelColors;
import graphicsEngine.panels.SimplePanel;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.awt.*;

abstract class AbstractSection extends SimplePanel {
    private static final boolean DRAW_BACKGROUND = false;

    protected AbstractSection(int[] size, @Nullable PanelColors panelColors, boolean border) {
        super(panelColors, border);
        setPreferredSize(new Dimension(size[0], size[1]));
        prepareParts();
    }

    @Override
    public final void resetBackground() {
        if (DRAW_BACKGROUND) {
            setOpaque(true);
            super.resetBackground();
        } else {
            setOpaque(false);
        }
    }

    private void prepareParts() {
        //setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        //setAlignmentX(Component.LEFT_ALIGNMENT);
        //setAlignmentY(Component.TOP_ALIGNMENT);
        setLayout(new BorderLayout(0, 0));
        add(containerPanel(), BorderLayout.NORTH);
    }

    private JPanel containerPanel() {
        JPanel panel = new JPanel() {
            {
                setOpaque(false);
                setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
                setAlignmentY(Component.TOP_ALIGNMENT);
            }
        };
        addParts(panel);
        return panel;
    }

    public abstract void addParts(JPanel panel);
}