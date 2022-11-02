package com.example.myapplication.providers;

import com.example.myapplication.views.View;

public interface ViewProvider {
    public void register(View view);
    public View find(Class<? extends View> cls);
}
