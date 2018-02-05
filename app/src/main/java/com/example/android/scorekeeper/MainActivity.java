package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Tracks the score for Team A
    int scoreTeamA = 0;

    // Tracks Team A fouls number
    int foulsTeamA = 0;

    // Tracks the score for Team B
    int scoreTeamB = 0;

    // Tracks Team B fouls number
    int foulsTeamB = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayScoreForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team B by 1 points.
     */
    public void addOneForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayScoreForTeamB(scoreTeamB);
    }

    /**
     * Increase the number of fouls Team A by 1.
     */
    public void addFoulTeamA(View v) {
        foulsTeamA = foulsTeamA + 1;
        displayFoulsForTeamA(foulsTeamA);
    }

    /**
     * Increase the number of fouls Team B by 1.
     */
    public void addFoulTeamB(View v) {
        foulsTeamB = foulsTeamB + 1;
        displayFoulsForTeamB(foulsTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayScoreForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayScoreForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given fouls number for Team A.
     */
    public void displayFoulsForTeamA(int fouls) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_fouls);
        scoreView.setText(String.valueOf(fouls));
    }

    /**
     * Displays the given fouls number for Team B.
     */
    public void displayFoulsForTeamB(int fouls) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_fouls);
        scoreView.setText(String.valueOf(fouls));
    }

    /**
     * Reset the score and number of fouls for Team A and Team B
     */
    public void resetScore(View v){
        scoreTeamA = 0;
        foulsTeamA = 0;
        scoreTeamB = 0;
        foulsTeamB = 0;
        displayScoreForTeamA(scoreTeamA);
        displayFoulsForTeamA(foulsTeamA);
        displayScoreForTeamB(scoreTeamB);
        displayFoulsForTeamB(foulsTeamB);
    }

}