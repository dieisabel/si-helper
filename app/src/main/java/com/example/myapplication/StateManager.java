package com.example.myapplication;

import com.example.myapplication.enums.Units;

public class StateManager {
    private static StateManager instance = null;

    private Units convertTo;
    private Units convertFrom;

    public static StateManager getInstance() {
        if (instance == null) {
            instance = new StateManager();
        }
        return instance;
    }

    public Units getConvertTo() {
        return convertTo;
    }

    public void setConvertTo(Units value) {
        convertTo = value;
    }

    public Units getConvertFrom() {
        return convertFrom;
    }

    public void setConvertFrom(Units value) {
        convertFrom = value;
    }
}
