package com.example.myapplication.adapters;

public class BaseUnitAdapter implements UnitAdapter {
    @Override
    public double convertFromBase(double value) {
        return value;
    }

    @Override
    public double convertToBase(double value) {
        return value;
    }
}
