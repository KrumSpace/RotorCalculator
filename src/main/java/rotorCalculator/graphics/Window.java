package rotorCalculator.graphics;

import graphicsEngine.windows.AbstractWindow;
import graphicsEngine.windows.WindowConfig;

//TODO: add javadoc
public class Window extends AbstractWindow {
    /**
     * Creates a new Window object with hardcoded configuration.
     */
    public Window() {
        super(config());
    }

    /**
     * Hardcoded configuration of a new Window object.
     *
     * @return Window configuration.
     */
    private static WindowConfig config() {
        String title = "Rotor calculator";
        int[]
                size = new int[] {1000, 500},
                location = new int[] {50, 50};
        WindowConfig config = new WindowConfig(title, size, location);
        config.closeOperation = EXIT_ON_CLOSE;
        return config;
    }

    /**
     * Adds parts to this window.
     */
    @Override
    public final void addParts() {
        add(new Page());
    }
}