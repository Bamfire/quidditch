package com.example.android.quidditch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.quidditch.R;

public class MainActivity extends AppCompatActivity {
    //Tracks the score for team A
    int scoreTeamA = 0;
    //Tracks the score for team B
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Adds 10 to team A's score when score button is pressed
    public void addTenTeamA (View v){
        scoreTeamA = scoreTeamA + 10;
        displayForTeamA(scoreTeamA);
    }

    //Adds 150 to team A's score when snitch button is pressed
    public void snitchTeamA (View v){
        scoreTeamA = scoreTeamA + 150;
        displayForTeamA(scoreTeamA);
    }

    //Adds 10 to team B's score when score button is pressed
    public void addTenTeamB (View v){
        scoreTeamB = scoreTeamB + 10;
        displayForTeamB(scoreTeamB);
    }

    //Adds 150 to team B's score when snitch button is pressed
    public void snitchTeamB (View v){
        scoreTeamB = scoreTeamB + 150;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     *  Resets the counters for both teams
     */
    public void resetCounter(View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}