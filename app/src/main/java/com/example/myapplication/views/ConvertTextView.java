package com.example.myapplication.views;

import android.app.Activity;
import android.widget.TextView;

import com.example.myapplication.R;

public class ConvertTextView implements View {
    private TextView widget;

    @Override
    public void init(Activity activity) {
        widget = activity.findViewById(R.id.convertResultText);
    }

    public void setText(String text) {
        widget.setText(text);
    }
}
