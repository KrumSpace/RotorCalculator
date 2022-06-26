package rotorCalculator.main;

import rotorCalculator.data.Data;
import rotorCalculator.graphics.GraphicsAdapter;

import static graphicsEngine.Utilities.printLine;

/**
 * Main class of the rotor calculator. Run main(args) to start.
 */
public class Main {
    /**
     * Main of the rotor calculator. Run to start.
     */
    public static void main(String[] args) {
        printLine("Starting rotor calculator.");
        prepareData();
        prepareResults();
        //TODO: if needed, start main runner with calculations here
        new GraphicsAdapter();
    }

    private static void prepareData() {
        //TODO: start data here
        Data.setRotor();
    }

    private static void prepareResults() {
        //TODO: calculate results beforehand
        Data.setResultContainer();
    }
}