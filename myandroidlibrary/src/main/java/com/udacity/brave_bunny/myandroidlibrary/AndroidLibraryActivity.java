package com.udacity.brave_bunny.myandroidlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AndroidLibraryActivity extends AppCompatActivity {

    public static final String JOKE_EXTRA = "joke-extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_library);

        String joke = getIntent().getStringExtra(JOKE_EXTRA);

        TextView view = (TextView) findViewById(R.id.joke);
        view.setText(joke);
    }
}
