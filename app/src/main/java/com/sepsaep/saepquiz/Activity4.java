package com.sepsaep.saepquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Asep Saepul on 04/05/2017.
 */

public class Activity4 extends AppCompatActivity  {

    EditText editText1, editText2, editText3;
    String answer1, answer2, answer3;
    Button btnNext4;
    int score;
    int get_intent4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        get_intent4 = getIntent().getIntExtra("score2", 0);
        score = get_intent4;

        editText1 = (EditText) findViewById(R.id.edit_text1);
        editText2 = (EditText) findViewById(R.id.edit_text2);
        editText3 = (EditText) findViewById(R.id.edit_text3);

        btnNext4 = (Button) findViewById(R.id.button_next4);
    }

    public void btnNext4 (View v) {

        answer1 = editText1.getText().toString();
        answer2 = editText2.getText().toString();
        answer3 = editText3.getText().toString();

        if (answer1.equals("berjanji")) {
            score = score + 15;
        }
        if (answer2.equals("berbakti")) {
            score = score + 15;
        }
        if (answer3.equals("mengabdi")) {
            score = score + 10;
        }
        else{

        }
        Intent intent4 = new Intent(getApplicationContext(),Activity5.class);
        intent4.putExtra("score3", score);
        startActivity(intent4);

    }

    @Override
    public void onBackPressed() {

    }
}
