package com.tw.vapasi;

//Understands error path for different measurement types
public class IncompatibleMeasurementTypeException extends Exception {
    public IncompatibleMeasurementTypeException() {
        super("Measurement types are incompatible. cannot perform operations");
    }
}
