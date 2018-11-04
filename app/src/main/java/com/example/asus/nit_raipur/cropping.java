package com.example.asus.nit_raipur;

import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.bumptech.glide.Glide;
import com.lyft.android.scissors.CropView;

import java.io.File;

public class cropping extends AppCompatActivity {

    private CropView imageView;
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cropping);

        Bundle bundle = getIntent().getExtras();

        File imgFile = (File) bundle.get("imgfile");
        imageView= findViewById(R.id.image1);
        button1 = (Button) findViewById(R.id.button1);

        imageView.setImageBitmap(BitmapFactory.decodeFile(imgFile.getPath()));


    }
}
