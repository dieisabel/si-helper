package com.example.myapplication.views;

import android.app.Activity;
import android.widget.EditText;

import com.example.myapplication.R;

public class ConvertTextInputView implements View {
    EditText widget;

    @Override
    public void init(Activity activity) {
        widget = activity.findViewById(R.id.convertTextInput);
        widget.setSingleLine();
    }

    public String getText() {
        return widget.getText().toString();
    }
}
