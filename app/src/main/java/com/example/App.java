package com.example;

import android.app.Application;
import com.example.dagger2.AppComponent;
import com.example.dagger2.AppModule;
import com.example.dagger2.DaggerAppComponent;

/**
 */
public class App extends Application {

    // 为什么可以使用静态
    public static AppComponent appComponent;
    @Override
    public void onCreate() {
        super.onCreate();
        // 实例化
        appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
    }
}
