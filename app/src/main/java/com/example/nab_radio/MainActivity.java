package com.example.nab_radio;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageButton playPauseBtn;
    private boolean isPlaying = false;

    private ImageView likeButton;
    private boolean isLiked = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        likeButton = findViewById(R.id.likeButton);
        likeButton.setOnClickListener(v -> {
            isLiked = !isLiked;

            if (isLiked) {
                likeButton.setImageResource(R.drawable.ic_heart_red);
            } else {
                likeButton.setImageResource(R.drawable.ic_heart);
            }
        });
        playPauseBtn = findViewById(R.id.jplaypauseBtn);

        playPauseBtn.setOnClickListener(v -> {
            isPlaying = !isPlaying;
            if (isPlaying) {
                playPauseBtn.setImageResource(R.drawable.pause);
            } else {
                playPauseBtn.setImageResource(R.drawable.play);
            }
        });
    }
}