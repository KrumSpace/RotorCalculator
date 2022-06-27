package graphicalOutput.graphics.panels.leftPanel;

import graphicsEngine.panels.PanelColors;
import graphicsEngine.panels.SimplePanel;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.awt.*;

abstract class AbstractColumn extends SimplePanel {
    protected AbstractColumn(int width, @Nullable PanelColors panelColors, boolean border) {
        super(panelColors, border);
        setPreferredSize(new Dimension(width, Integer.MAX_VALUE));
        prepareParts();
    }

    private void prepareParts() {
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

    public abstract void addParts(JPanel p);
}