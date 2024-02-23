package com.example.matrixid;

import android.graphics.PixelFormat;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class HbdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hbd);
    }

    public void HBDMovie(View view){
        Button playMovie = findViewById(R.id.play);

        getWindow().setFormat(PixelFormat.UNKNOWN);

        VideoView Video = findViewById(R.id.video);

        String UriPath = "android.resource://com.example.matrixid/"+R.raw.movie;

        Uri uri = Uri.parse(UriPath);

        Video.setVideoURI(uri);
        Video.requestFocus();
        Video.start();

        playMovie.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){

                VideoView Video =  findViewById(R.id.video);

                String UriPath = "android.resource://com.example.matrixid/"+R.raw.movie;

                Uri uri = Uri.parse(UriPath);

                Video.setVideoURI(uri);
                Video.requestFocus();
                Video.start();
            }
        });
    }

}