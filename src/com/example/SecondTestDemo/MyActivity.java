package com.example.SecondTestDemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MyActivity extends Activity {
    private String mFirst;


    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        action();
    }

    private void action() {
        Intent intent = new Intent(MyActivity.this, SecondActivity.class);
        startActivity(intent);
    }
}