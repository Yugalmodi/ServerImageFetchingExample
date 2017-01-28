package com.techpalle.serverimagefetchingexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.iv);
        Glide.with(this).load("http://www.mapsofindia.com/maps/india/india-flag.jpg").
                placeholder(R.mipmap.ic_launcher).crossFade().into(imageView);
    }
}
