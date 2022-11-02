package com.example.myapplication.adapters;

public class MilliUnitAdapter implements UnitAdapter {
    @Override
    public double convertFromBase(double value) {
        return value * 1e+3;
    }

    @Override
    public double convertToBase(double value) {
        return value * 1e-3;
    }
}
