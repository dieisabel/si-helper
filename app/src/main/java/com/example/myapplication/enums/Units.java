package com.example.myapplication.enums;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

public enum Units {
    BASE("Base"),
    MILLI("Milli"),
    MICRO("Micro"),
    NANO("Nano"),
    KILO("Kilo"),
    MEGA("Mega"),
    GIGA("Giga"),
    ;

    private final String description;

    Units(String description) {
        this.description = description;
    }

    @NonNull
    @Override
    public String toString() {
        return description;
    }

    public static Units fromString(String string) {
        for (Units unit : Units.values()) {
            if (unit.toString().equals(string)) {
                return unit;
            }
        }
        return null;
    }

    public static String[] toArray() {
        List<String> units = new ArrayList<>();
        for (Units unit : Units.values()) {
            units.add(unit.toString());
        }
        return units.toArray(new String[0]);
    }
}
