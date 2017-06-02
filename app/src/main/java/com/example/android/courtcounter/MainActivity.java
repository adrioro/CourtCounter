package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(9);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.display_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the button_3points button is clicked.
     */
    public void button_3points(View view) {
        String scoreMessage = "score =" + (score * 3);
        displayMessage(scoreMessage);
    }

    /**
     * This method displays the given score value on the screen.
     */

    private void display_score(int number) {
        TextView scoreTextView = (TextView) findViewById(R.id.display_score);
        scoreTextView.setText("" + number);
    }
}
