package com.example.myapplication.services;

import com.example.myapplication.enums.Units;

public interface ConvertService {
    public double convert(Units fromUnit, Units toUnit, double value);
}
