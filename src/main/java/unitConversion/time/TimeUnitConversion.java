package unitConversion.time;

import unitConversion.AbstractConversion;
import unitConversion.AbstractUnit;
import unitConversion.ConversionMetadata;
import unitConversion.ConversionMetadata.ConversionType;

import org.jetbrains.annotations.NotNull;

public class TimeUnitConversion extends AbstractConversion {
    public TimeUnitConversion() {}

    @Override
    public ConversionMetadata getConversionMetadata(@NotNull AbstractUnit sourceUnits,
                                                    @NotNull AbstractUnit targetUnits) {
        if (sourceUnits instanceof Units.Second) {
            if (targetUnits instanceof Units.Minute) {
                return new ConversionMetadata(ConversionType.DIVIDE, 60);
            } else if (targetUnits instanceof Units.Hour) {
                return new ConversionMetadata(ConversionType.DIVIDE, 60 * 60);
            } else {
                return new ConversionMetadata();
            }
        } else if (sourceUnits instanceof Units.Minute) {
            if (targetUnits instanceof Units.Hour) {
                return new ConversionMetadata(ConversionType.DIVIDE, 60);
            } else if (targetUnits instanceof Units.Second) {
                return new ConversionMetadata(ConversionType.MULTIPLY, 60);
            } else {
                return new ConversionMetadata();
            }
        } else if (sourceUnits instanceof Units.Hour) {
            if (targetUnits instanceof Units.Second) {
                return new ConversionMetadata(ConversionType.MULTIPLY, 60 * 60);
            } else if (targetUnits instanceof Units.Minute) {
                return new ConversionMetadata(ConversionType.MULTIPLY, 60);
            } else {
                return new ConversionMetadata();
            }
        }
        return new ConversionMetadata();
    }
}