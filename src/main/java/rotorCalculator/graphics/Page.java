package rotorCalculator.graphics;

import graphicsEngine.panels.PanelColors;
import graphicsEngine.windows.AbstractPage;
import rotorCalculator.graphics.panels.Center;
import rotorCalculator.graphics.panels.leftPanel.LeftPanel;

import java.awt.*;

public class Page extends AbstractPage {
    Page() {
        super();
        addParts();
    }

    @Override
    public String getPageKey() {
        return "page";
    }

    private void addParts() {
        setLayout(new BorderLayout(0, 0));
        add(new LeftPanel(new PanelColors()), BorderLayout.WEST);
        add(new Center(), BorderLayout.CENTER);
    }
}