package com.sepsaep.saepquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

/**
 * Created by Asep Saepul on 29/04/2017.
 */

public class Activity3 extends AppCompatActivity {

    CheckBox cbPanca1, cbPanca2, cbPanca3, cbPanca4;
    Button buttonNext3;
    int score;
    int get_intent3;
    int numberOfCheckboxesChecked = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        get_intent3 = getIntent().getIntExtra("score", 0);
        score = get_intent3;

        cbPanca1 = (CheckBox) findViewById(R.id.cb_panca_1);
        cbPanca2 = (CheckBox) findViewById(R.id.cb_panca_2);
        cbPanca3 = (CheckBox) findViewById(R.id.cb_panca_3);
        cbPanca4 = (CheckBox) findViewById(R.id.cb_panca_4);

        buttonNext3 = (Button) findViewById(R.id.button_next3);

        cbPanca1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 2) {
                    cbPanca1.setChecked(false);
                } else {

                    if (isChecked) {
                        numberOfCheckboxesChecked++;
                    } else {
                        numberOfCheckboxesChecked--;
                    }

                }
            }
        });

        cbPanca2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 2) {
                    cbPanca2.setChecked(false);
                } else {

                    if (isChecked) {
                        numberOfCheckboxesChecked++;
                    } else {
                        numberOfCheckboxesChecked--;
                    }

                }
            }
        });
        cbPanca3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 2) {
                    cbPanca3.setChecked(false);
                } else {

                    if (isChecked) {
                        numberOfCheckboxesChecked++;
                    } else {
                        numberOfCheckboxesChecked--;
                    }

                }
            }
        });
        cbPanca4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 2) {
                    cbPanca4.setChecked(false);
                } else {

                    if (isChecked) {
                        numberOfCheckboxesChecked++;
                    } else {
                        numberOfCheckboxesChecked--;
                    }

                }
            }
        });

    }

    private int GetScore(boolean panca1, boolean panca3) {

        if (panca1) {
            score = score + 10;
        }
        if (panca3) {
            score = score + 10;
        }

        return score;
    }

        public void btnNext3(View v) {

        boolean panca1 = cbPanca1.isChecked();
        boolean panca3 = cbPanca3.isChecked();

        int NewScore = GetScore(panca1,panca3);
        Intent intent3 = new Intent(getApplicationContext(),Activity4.class);
        intent3.putExtra("score2", NewScore);
        startActivity(intent3);
    }

    @Override
    public void onBackPressed() {

    }
}