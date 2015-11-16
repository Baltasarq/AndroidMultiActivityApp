package com.devbaltasarq.Multiactividad;

import android.app.Application;

/**
 * Created by pcmorales on 16/11/15.
 */
public class MultiActivityApp extends Application {
    @Override
    public void onCreate() {
        this.data = "App multiactividad";
    }

    public String getData() {
        return this.data;
    }

    private String data;
}
