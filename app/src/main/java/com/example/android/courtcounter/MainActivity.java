package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int score = 1;
    TextView txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt2 = (TextView) findViewById(R.id.text2);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.text2);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the button +3Points is clicked.
     */
    public void TeamAScores3(View view) {
        Integer scoreA = score * 3;
        displayScore(scoreA);
    }

    /**
     * This method is called when the button +2Points is clicked.
     */
    public void TeamAScores2(View view) {
        Integer scoreB = score * 2;
        displayScore(scoreB);
    }

    /**
     * This method displays the given score on the screen.
     */

    public void displayScore(int number) {
        txt2.setText(String.valueOf(number));

    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView txt2 = (TextView) findViewById(R.id.text2);
        txt2.setText(message);

    }

    public void TeamAScores1(View view) {
        Integer scoreC = score;
        displayScore(scoreC);;
    }


}



