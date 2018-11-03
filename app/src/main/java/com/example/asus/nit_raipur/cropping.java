package com.example.asus.nit_raipur;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.bumptech.glide.Glide;
import com.lyft.android.scissors.CropView;

public class cropping extends AppCompatActivity {

    private CropView imageView;
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cropping);

        String imgUrl = getIntent().getStringExtra("imgUrl");
        imageView= findViewById(R.id.image1);
        button1 = (Button) findViewById(R.id.button1);

        Glide.with(this)
                .load(imgUrl)
                .into(imageView);


    }
}
