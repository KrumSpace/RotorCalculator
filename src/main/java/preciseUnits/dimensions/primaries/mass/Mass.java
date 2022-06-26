package preciseUnits.dimensions.primaries.mass;


import preciseUnits.dimensions.primaries.AbstractPrimaryDimension;
import preciseUnits.AbstractUnit;
import preciseUnits.dimensions.primaries.mass.units.Kilogram;

//TODO: add javadoc
public class Mass extends AbstractPrimaryDimension {
    public Mass() {
        super("mass", new Kilogram());
    }
}