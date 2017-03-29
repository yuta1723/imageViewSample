package com.example.yutan.imageviewsample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button_center = (Button) findViewById(R.id.button_center);
        button_center.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startSubActivity("center");
            }
        });
        Button button_centerCrop = (Button) findViewById(R.id.button_centerCrop);
        button_centerCrop.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startSubActivity("centerCrop");
            }
        });
        Button button_centerInside = (Button) findViewById(R.id.button_centerInside);
        button_centerInside.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startSubActivity("centerInside");
            }
        });
        Button button_fitCenter = (Button) findViewById(R.id.button_fitCenter);
        button_fitCenter.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startSubActivity("fitCenter");
            }
        });
        Button button_fixXY = (Button) findViewById(R.id.button_fixXY);
        button_fixXY.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startSubActivity("fitXY");
            }
        });
    }

    private void startSubActivity(String paramete) {
        Intent intent = new Intent();
        intent.setClass(this, SubActiity.class);
        intent.putExtra("scaleType", paramete);
        startActivity(intent);
    }
}
