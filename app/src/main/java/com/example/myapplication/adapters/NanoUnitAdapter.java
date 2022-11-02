package com.example.myapplication.adapters;

public class NanoUnitAdapter implements UnitAdapter {
    @Override
    public double convertFromBase(double value) {
        return value * 1e+9;
    }

    @Override
    public double convertToBase(double value) {
        return value * 1e-9;
    }
}
