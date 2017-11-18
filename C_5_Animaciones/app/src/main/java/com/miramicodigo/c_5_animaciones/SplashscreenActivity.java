package com.miramicodigo.c_5_animaciones;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.widget.ImageView;

public class SplashscreenActivity extends AppCompatActivity {

    /**
     * @author Gustavo Lizarraga
     * @date 17-11-17
     * @version 1.0
     *
     * #AndroidCampBO
     *
     * */

    private ImageView ivLogo;
    private Animation animacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        ivLogo = (ImageView) findViewById(R.id.ivLogotipo);


    }
}
