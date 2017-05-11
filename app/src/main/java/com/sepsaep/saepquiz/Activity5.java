package com.sepsaep.saepquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Asep Saepul on 29/04/2017.
 */

public class Activity5 extends AppCompatActivity {

    Button btnSubmit;
    int date = 10;
    int score;
    int get_intent5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);

        get_intent5 = getIntent().getIntExtra("score3",0);
        score = get_intent5;

        btnSubmit = (Button) findViewById(R.id.button_submit);
    }

    public void decrement (View view) {

        if (date <= 1) {
            Toast.makeText(this,"too little", Toast.LENGTH_SHORT).show();
            return;
        }
        date = date - 1;
        displayDate(date);
    }

    public void increment (View view) {

        if (date >= 31) {
            Toast.makeText(this,"too much", Toast.LENGTH_SHORT).show();
            return;
        }
        date = date + 1;
        displayDate(date);
    }

    private void displayDate(int dates) {
        TextView dateTextView = (TextView) findViewById(R.id.text_date);
        dateTextView.setText("" + dates);
    }

    public void btnSubmit (View v) {

        if ( date == 17) {
            score = score + 30 ;
        }
        else{
            score = score + 0 ;
        }
        Intent intent5 = new Intent(getApplicationContext(), ActivityFinal.class);
        intent5.putExtra("score4", score);
        startActivity(intent5);
    }

    @Override
    public void onBackPressed() {

    }

}
