package com.example.myapplication.controllers;

import android.view.View;

import com.example.myapplication.Config;
import com.example.myapplication.StateManager;
import com.example.myapplication.providers.ViewProvider;
import com.example.myapplication.providers.ViewProviderImpl;
import com.example.myapplication.services.ConvertService;
import com.example.myapplication.services.ConvertServiceImpl;
import com.example.myapplication.views.ConvertTextInputView;
import com.example.myapplication.views.ConvertTextView;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class ConvertButtonController implements View.OnClickListener {
    @Override
    public void onClick(View view) {
        StateManager stateManager = StateManager.getInstance();
        ViewProvider viewProvider = ViewProviderImpl.getInstance();
        // TODO: Handle errors if views do not exists (returns null)
        ConvertTextView textView =
                (ConvertTextView) viewProvider.find(ConvertTextView.class);
        ConvertTextInputView textInputView =
                (ConvertTextInputView) viewProvider.find(ConvertTextInputView.class);

        // I didn't place input text in state manager because it's hard to check if user
        // is done writing and we can grab data and place in state manager
        if (textInputView.getText().isEmpty()) {
            textView.setText("Set value!");
            return;
        }
        // TODO: Handle errors if user input is not numerical
        double inputValue = Double.parseDouble(textInputView.getText());
        ConvertService convertService = new ConvertServiceImpl();
        double result = convertService.convert(
                stateManager.getConvertFrom(),
                stateManager.getConvertTo(),
                inputValue
        );
        textView.setText(formatOutput(result));
    }

    private String formatOutput(double result) {
        BigDecimal bigDecimal = new BigDecimal(result)
                .setScale(Config.DOUBLE_PRECISION, Config.DOUBLE_ROUNDING_MODE);
        DecimalFormat format = new DecimalFormat("0.#############");
        return format.format(bigDecimal);
    }
}