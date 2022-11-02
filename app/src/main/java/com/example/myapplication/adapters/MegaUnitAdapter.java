package com.example.myapplication.adapters;

public class MegaUnitAdapter implements UnitAdapter {
    @Override
    public double convertFromBase(double value) {
        return value * 1e-6;
    }

    @Override
    public double convertToBase(double value) {
        return value * 1e+6;
    }
}
