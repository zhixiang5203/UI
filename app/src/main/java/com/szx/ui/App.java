package com.szx.ui;

import android.app.Application;

import com.szx.crash.SpiderMan;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //放在其他库初始化前
        SpiderMan.init(this)
                .setTheme(R.style.CustomTheme);
    }
}
