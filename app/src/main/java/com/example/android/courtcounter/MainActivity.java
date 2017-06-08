package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    TextView txt2;
    TextView txt1;
    int reset = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /*
     HERE STARTS SPECIFIC CODE FOR TEAM A
     */


     /* This method is called when the button +3Points is clicked.
     */

    public void TeamAScores3ForA(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayScoreForA(scoreTeamA);
    }

    /*
     This method is called when the button +2Points is clicked.
     */
    public void TeamAScores2ForA(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayScoreForA(scoreTeamA);
    }

    /**
     * This method is called when the button button_free is clicked.
     */
    public void TeamAScores1ForA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayScoreForA(scoreTeamA);
    }

    /**
     * This method displays the given score for Team A on the screen.
     */

    public void displayScoreForA(int number) {
        TextView txt2 = (TextView) findViewById(R.id.text2A);
        txt2.setText(String.valueOf(number));

    }

    /*
     HERE STARTS SPECIFIC CODE FOR TEAM B
     */

     /* This method is called when the button +3Points is clicked.
     */
    public void TeamAScores3ForB(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayScoreForB(scoreTeamB);
    }

    /*
     This method is called when the button +2Points is clicked.
     */
    public void TeamAScores2ForB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayScoreForB(scoreTeamB);
    }

    /*
     This method is called when the button button_free is clicked.
     */
    public void TeamAScores1ForB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayScoreForB(scoreTeamB);
    }

    /*
     This method displays the given score for Team B on the screen.
     */

    public void displayScoreForB(int number) {
        TextView txt2 = (TextView) findViewById(R.id.text2B);
        txt2.setText(String.valueOf(number));

    }

    /*
     CODE FOR RESET BUTTON
     */


    /* This method is called when the button Reset is clicked.
     */

    public void ResetAllScores(View view) {
        displayReset(reset);

    }

    public void displayReset(int number) {
        TextView txt2 = (TextView) findViewById(R.id.text2B);
        txt2.setText(String.valueOf(number));
        TextView txt1 = (TextView) findViewById(R.id.text2A);
        txt1.setText(String.valueOf(number));
        scoreTeamA = 0;
        scoreTeamB = 0;

    }


}



