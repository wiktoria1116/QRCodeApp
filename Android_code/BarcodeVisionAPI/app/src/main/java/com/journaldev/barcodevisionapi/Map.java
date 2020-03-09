package com.journaldev.barcodevisionapi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Map extends AppCompatActivity {

    ImageView image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        image = (ImageView)findViewById(R.id.image);
        image.setVisibility(View.VISIBLE);
    }
}
