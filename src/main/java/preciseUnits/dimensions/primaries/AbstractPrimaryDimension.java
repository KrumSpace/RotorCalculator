package preciseUnits.dimensions.primaries;

import preciseUnits.dimensions.AbstractDimension;

import org.jetbrains.annotations.NotNull;

//TODO: add javadoc
public abstract class AbstractPrimaryDimension extends AbstractDimension {
    public AbstractPrimaryDimension(@NotNull String name) {
        super(name);
    }
}