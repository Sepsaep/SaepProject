package com.sepsaep.saepquiz;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Asep Saepul on 29/04/2017.
 */

public class ActivityFinal extends AppCompatActivity {
    TextView textScore;
    int score_final;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        Vibrator v = (Vibrator) this.getApplication().getSystemService(Context.VIBRATOR_SERVICE);
        // Vibrate for 500 milliseconds
        v.vibrate(1000);

        score_final = getIntent().getIntExtra("score4", 0);

        textScore = (TextView) findViewById(R.id.text_score);
        textScore.setText("Score :" + score_final);

    }

    public void btnAgain (View view) {

        Intent intentAgain = new Intent(getApplicationContext(),SplashScreen.class);
        intentAgain.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intentAgain);
    }

    public void btnExit (View exit) {

        moveTaskToBack(true);
    }


    @Override
    public void onBackPressed() {

    }
}