package rotorCalculator.graphics;

import graphicsEngine.AbstractGraphicsAdapter;

/**
 * Graphics adapter class for interfacing graphics engine.
 */
public class GraphicsAdapter extends AbstractGraphicsAdapter {
    /**
     * Default constructor. Starts a new Window object.
     */
    public GraphicsAdapter() {
        super();
        graphics.newWindow(new Window());
    }
}