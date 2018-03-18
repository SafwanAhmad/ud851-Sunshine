package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String weatherInfo = getIntent().getStringExtra("WEATHER");

        if(weatherInfo != null && weatherInfo.length() != 0){
            Toast info = Toast.makeText(this, weatherInfo, Toast.LENGTH_LONG);
            info.show();
        }

        TextView textView = (TextView) findViewById(R.id.tv_display);
        if (textView != null) {
            textView.setText(weatherInfo);
        }
    }
}
