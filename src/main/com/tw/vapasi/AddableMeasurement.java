package com.tw.vapasi;

//Understands quantity that can be added
public class AddableMeasurement extends Measurement {
    AddableMeasurement(double magnitude, Unit unit) {
        super(magnitude, unit);
    }

    static AddableMeasurement cm(double magnitude) {
        return new AddableMeasurement(magnitude, Unit.CM);
    }

    static AddableMeasurement km(double magnitude) {
        return new AddableMeasurement(magnitude, Unit.KM);
    }

    static AddableMeasurement meter(double magnitude) {
        return new AddableMeasurement(magnitude, Unit.M);
    }

    static AddableMeasurement kg(double magnitude) {
        return new AddableMeasurement(magnitude, Unit.KG);
    }

    static AddableMeasurement gm(double magnitude) {
        return new AddableMeasurement(magnitude, Unit.GM);
    }

    AddableMeasurement add(AddableMeasurement other) throws IncompatibleMeasurementTypeException {
        if (this.unit.isNotOfSameType(other.unit)) {
            throw new IncompatibleMeasurementTypeException();
        }
        double totalInBase = convertToBaseUnit() + other.convertToBaseUnit();
        return new AddableMeasurement(convertToUnit(totalInBase), this.unit);
    }

}
