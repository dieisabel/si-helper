package com.example.myapplication.providers;

import com.example.myapplication.views.View;

import java.util.ArrayList;
import java.util.List;

// TODO: Handle error if client trying to add two views with the same class
public class ViewProviderImpl implements ViewProvider {
    private static ViewProvider instance;
    private final List<View> views = new ArrayList<>();

    public static ViewProvider getInstance() {
        if (instance == null) {
            instance = new ViewProviderImpl();
        }
        return instance;
    }

    public void register(View view) {
        views.add(view);
    }

    // TODO: Maybe raise an exception or return optional instead of returning null?
    public View find(Class<? extends View> cls) {
        for (View obj : views) {
            if (obj.getClass() == cls) {
                return obj;
            }
        }
        return null;
    }
}
