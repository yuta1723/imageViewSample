package com.example.yutan.imageviewsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;

/**
 * Created by yuta.n on 2017/03/29.
 */

public class SubActiity extends AppCompatActivity {
    String TAG = SubActiity.class.getSimpleName();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        Intent intent = getIntent();
        String scaleType = intent.getStringExtra("scaleType");
        ImageView imageView = (ImageView) findViewById(R.id.activity_image);
        if (scaleType.equals("center")) {
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            Log.d(TAG,"clicked center");
        } else if (scaleType.equals("centerCrop")) {
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            Log.d(TAG,"clicked centerCrop");
        } else if (scaleType.equals("fitCenter")) {
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            Log.d(TAG,"clicked fitCenter");
        } else if (scaleType.equals("centerInside")) {
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            Log.d(TAG,"clicked centerInside");
        } else {
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            Log.d(TAG,"clicked FIT_XY");
        }
    }
}
