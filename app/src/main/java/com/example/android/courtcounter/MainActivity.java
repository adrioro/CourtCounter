package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    TextView txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt2 = (TextView) findViewById(R.id.text2);
    }


    /**
     * This method is called when the button +3Points is clicked.
     */
    public void TeamAScores3(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayScore(scoreTeamA);
    }

    /**
     * This method is called when the button +2Points is clicked.
     */
    public void TeamAScores2(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayScore(scoreTeamA);
    }

    /**
     * This method is called when the button button_free is clicked.
     */
    public void TeamAScores1(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayScore(scoreTeamA);
    }

    /**
     * This method displays the given score on the screen.
     */

    public void displayScore(int number) {
        txt2.setText(String.valueOf(number));

    }


}



