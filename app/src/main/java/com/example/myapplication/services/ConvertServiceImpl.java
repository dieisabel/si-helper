package com.example.myapplication.services;

import com.example.myapplication.adapters.UnitAdapter;
import com.example.myapplication.enums.Units;
import com.example.myapplication.factories.AbstractFactory;
import com.example.myapplication.factories.AdapterFactory;

public class ConvertServiceImpl implements ConvertService {
    @Override
    public double convert(Units fromUnit, Units toUnit, double value) {
        if (toUnit.equals(fromUnit)) {
            return value;
        }
        AbstractFactory<UnitAdapter, Units> factory = new AdapterFactory();
        // TODO: Handle null errors if adapter for unit doesn't exists
        UnitAdapter fromAdapter = factory.create(fromUnit);
        UnitAdapter toAdapter = factory.create(toUnit);
        double baseValue = fromAdapter.convertToBase(value);
        return toAdapter.convertFromBase(baseValue);
    }
}
