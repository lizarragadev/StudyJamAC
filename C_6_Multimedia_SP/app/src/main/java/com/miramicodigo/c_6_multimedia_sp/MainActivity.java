package com.miramicodigo.c_6_multimedia_sp;

import android.annotation.TargetApi;
import android.media.SoundPool;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    /**
     * @author Gustavo Lizarraga
     * @version 1.0
     * @date 17-11-17
     *
     * #AndroidCampBO
     * */

    private SoundPool spIdiota, spCallate, spVeteAlDiablo;
    private int resIdiota, resCallate, resVeteAlDiablo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createSoundPool();
    }

    private void createSoundPool() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            createNewSoundPool();
        } else {
            createOldSoundPool();
        }
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    protected void createNewSoundPool(){

        chargeSoundPool();
    }

    @SuppressWarnings("deprecation")
    protected void createOldSoundPool(){

        chargeSoundPool();
    }

    public void chargeSoundPool() {

    }

    public void idiota(View v) {

    }

    public void callate(View v) {

    }

    public void veteAlDiablo(View v) {

    }
}
