package preciseUnits.dimensions;

import preciseUnits.AbstractUnit;

public class Dimensions {

    static class Dimension {
        String name;
        AbstractUnit SI_unit;
    }

    static class PrimaryDimension extends Dimension {

    }

    enum SI_Types {

    }

    static class SecondaryDimension extends Dimension {

    }
}