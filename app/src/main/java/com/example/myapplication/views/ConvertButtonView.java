package com.example.myapplication.views;

import android.app.Activity;
import android.widget.Button;

import com.example.myapplication.R;
import com.example.myapplication.controllers.ConvertButtonController;

public class ConvertButtonView implements View {
    @Override
    public void init(Activity activity) {
        Button widget = activity.findViewById(R.id.convertButton);
        widget.setOnClickListener(new ConvertButtonController());
    }
}
