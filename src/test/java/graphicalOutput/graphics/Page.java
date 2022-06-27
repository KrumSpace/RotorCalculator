package graphicalOutput.graphics;

import graphicalOutput.graphics.panels.leftPanel.LeftPanel;
import graphicsEngine.panels.PanelColors;
import graphicsEngine.windows.AbstractPage;
import graphicalOutput.graphics.panels.Center;

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