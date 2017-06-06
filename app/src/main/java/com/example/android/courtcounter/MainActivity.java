package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

import static android.R.id.message;


public class MainActivity extends AppCompatActivity {
    int score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public boolean onOptionsItemSelected(Menu menu) {
        //Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //Handle action bar item clicks here. The action bar will
        //automatically handle clicks on the Home/Up button, so long
        //as you specify a parent activity in AndroidManifest.sml.
        int id = item.getItemId();
        //noinspection SimplifiableStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the buttonA is clicked.
     */
    public void sendMessage(View view) {
        Integer scoreA = score * 3;
        displayScore(scoreA);
    }

    /**
     * This method displays the given score on the screen.
     */

    public void displayScore (int number) {
        TextView txt2 = (TextView) findViewById(R.id.text2);
        txt2.setText(NumberFormat.getCurrencyInstance().format(number));

    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView txt2 = (TextView) findViewById(R.id.text2);
        txt2.setText(message);

    }


}



