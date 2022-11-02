package com.example.myapplication.factories;

import com.example.myapplication.adapters.BaseUnitAdapter;
import com.example.myapplication.adapters.GigaUnitAdapter;
import com.example.myapplication.adapters.KiloUnitAdapter;
import com.example.myapplication.adapters.MegaUnitAdapter;
import com.example.myapplication.adapters.MicroUnitAdapter;
import com.example.myapplication.adapters.MilliUnitAdapter;
import com.example.myapplication.adapters.NanoUnitAdapter;
import com.example.myapplication.adapters.UnitAdapter;
import com.example.myapplication.enums.Units;

import java.util.HashMap;
import java.util.Map;

public class AdapterFactory implements AbstractFactory<UnitAdapter, Units> {
    private final Map<Units, Class<? extends UnitAdapter>> registry = new HashMap<>();

    public AdapterFactory() {
        registry.put(Units.MILLI, MilliUnitAdapter.class);
        registry.put(Units.MICRO, MicroUnitAdapter.class);
        registry.put(Units.NANO, NanoUnitAdapter.class);
        registry.put(Units.GIGA, GigaUnitAdapter.class);
        registry.put(Units.KILO, KiloUnitAdapter.class);
        registry.put(Units.MEGA, MegaUnitAdapter.class);
        registry.put(Units.BASE, BaseUnitAdapter.class);
    }

    // TODO: Refactor. Why return null and better indicate if exceptions are occurs
    public UnitAdapter create(Units unit) {
        Class<? extends UnitAdapter> cls = registry.get(unit);
        if (cls == null) {
           return null;
        }
        try {
            return cls.newInstance();
        } catch (IllegalAccessException | InstantiationException exception) {
            exception.printStackTrace();
        }
        return null;
    }
}
