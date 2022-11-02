package com.example.myapplication.views;

import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.myapplication.R;
import com.example.myapplication.enums.Units;
import com.example.myapplication.controllers.ConvertToDropdownController;

public class ConvertToDropdownView implements View {
    @Override
    public void init(Activity activity) {
        Spinner widget = activity.findViewById(R.id.convertToDropdown);
        widget.setAdapter(
                new ArrayAdapter<String>(
                        activity.getBaseContext(),
                        android.R.layout.simple_spinner_dropdown_item,
                        Units.toArray()
                )
        );
        widget.setOnItemSelectedListener(new ConvertToDropdownController());
    }
}
