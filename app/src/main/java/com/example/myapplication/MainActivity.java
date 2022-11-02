package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;;

import com.example.myapplication.providers.ViewProvider;
import com.example.myapplication.providers.ViewProviderImpl;
import com.example.myapplication.views.ConvertButtonView;
import com.example.myapplication.views.ConvertFromDropdownView;
import com.example.myapplication.views.ConvertTextInputView;
import com.example.myapplication.views.ConvertTextView;
import com.example.myapplication.views.ConvertToDropdownView;
import com.example.myapplication.views.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeViews(this);
    }

    private void initializeViews(Activity activity) {
        ViewProvider viewProvider = ViewProviderImpl.getInstance();

        View convertToDropdownView = new ConvertToDropdownView();
        convertToDropdownView.init(activity);
        viewProvider.register(convertToDropdownView);

        View convertFromDropdownView = new ConvertFromDropdownView();
        convertFromDropdownView.init(activity);
        viewProvider.register(convertFromDropdownView);

        View convertButtonView = new ConvertButtonView();
        convertButtonView.init(activity);
        viewProvider.register(convertButtonView);

        View convertTextInputView = new ConvertTextInputView();
        convertTextInputView.init(activity);
        viewProvider.register(convertTextInputView);

        View convertTextView = new ConvertTextView();
        convertTextView.init(activity);
        viewProvider.register(convertTextView);
    }
}