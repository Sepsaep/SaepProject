package com.sepsaep.saepquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

/**
 * Created by Asep Saepul on 29/04/2017.
 */

public class Activity2 extends AppCompatActivity {

    Button buttonNext2;
    RadioButton rdbSoekarno,rdbSudirman,rdbHatta,rdbJokowi ;
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        rdbSoekarno = (RadioButton) findViewById(R.id.radio_button_soekarno);
        rdbSudirman = (RadioButton) findViewById(R.id.radio_button_sudirman);
        rdbHatta = (RadioButton) findViewById(R.id.radio_button_hatta);
        rdbJokowi = (RadioButton) findViewById(R.id.radio_button_jokowi);

        buttonNext2 = (Button) findViewById(R.id.button_next2);

        rdbSoekarno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score = 0;
            }
        });

        rdbSudirman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score = 0;
            }
        });

        rdbHatta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score = 10 ;
            }
        });

        rdbJokowi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score = 0;
            }
        });

        buttonNext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Activity3.class);
                intent.putExtra("score",score);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onBackPressed() {

    }
}
