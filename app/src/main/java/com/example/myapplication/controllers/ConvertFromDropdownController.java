package com.example.myapplication.controllers;

import android.view.View;
import android.widget.AdapterView;

import com.example.myapplication.StateManager;
import com.example.myapplication.enums.Units;

public class ConvertFromDropdownController implements AdapterView.OnItemSelectedListener {
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
        StateManager stateManager = StateManager.getInstance();
        String currentItemValue = adapterView.getItemAtPosition(position).toString();
        stateManager.setConvertFrom(Units.fromString(currentItemValue));
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {}
}
