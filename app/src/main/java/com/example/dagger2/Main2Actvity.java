package com.example.dagger2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import javax.inject.Inject;

/**
 * 被跳转界面
 */
public class Main2Actvity extends AppCompatActivity {

    @Inject
    Person person;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView = new TextView(this);
        textView.setText("Dagger2跳转界面");
        setContentView(textView);
        // 构造桥梁对象
        MainComponent component = DaggerMainComponent.builder().mainModule(new MainModule(this)).build();
        //注入
        component.inject(this);
        Log.i("dagger", "person = " + person.toString());
    }
}
