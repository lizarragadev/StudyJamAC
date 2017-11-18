package com.miramicodigo.c_5_multimedia_mp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button btnPlay;
    private Button btnPause;
    private Button btnStop;
    private ImageView ivAlpha;

    private Animation animacion;

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPlay = (Button) findViewById(R.id.btnPlay);
        btnPause = (Button) findViewById(R.id.btnPause);
        btnStop = (Button) findViewById(R.id.btnStop);
        ivAlpha = (ImageView) findViewById(R.id.ivAlpha);

        initUI();
        initMediaPlayer();
    }

    public void initUI() {

    }

    public void initMediaPlayer() {

    }

    public void play(View view) {

    }

    public void pause(View view) {

    }

    public void stop(View view) {

    }
}
