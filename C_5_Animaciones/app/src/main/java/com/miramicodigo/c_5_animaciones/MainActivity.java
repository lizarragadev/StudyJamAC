package com.miramicodigo.c_5_animaciones;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    /**
     * @author Gustavo Lizarraga
     * @date 17-11-17
     * @version 1.0
     *
     * #AndroidCampBO
     *
     * */

    private ImageView ivCampWhite;
    private ImageView ivCampColor;

    private Animation animacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivCampWhite = (ImageView) findViewById(R.id.ivCampWhite);
        ivCampColor = (ImageView) findViewById(R.id.ivCampColor);
    }

    public void zoomin(View v) {

    }

    public void zoomout(View v) {

    }

    public void fadein(View v) {

    }

    public void fadeout(View v) {

    }

    public void rotate(View v) {

    }

    public void move(View v) {

    }

    public void slideup(View v) {

    }

    public void slidedown(View v) {

    }

    public void blink(View v) {

    }

    public void bounce(View v) {

    }

    public void crossfade(View v){

    }

    public void sequential(View v) {

    }

    public void together(View v) {

    }

    public void stop(View v){

    }

}
