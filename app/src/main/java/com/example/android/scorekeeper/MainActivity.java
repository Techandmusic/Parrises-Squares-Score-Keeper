package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore;
    int teamBScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*team A button listeners */

    public void pyramidGoalA(View view) {
        teamAScore = teamAScore + 7;
        displayforTeamA(teamAScore);
    }

    public void fieldThrowA(View view) {
        teamAScore = teamAScore + 3;
        displayforTeamA(teamAScore);
    }

    public void rampGoalA(View view) {
        teamAScore = teamAScore + 10;
        displayforTeamA(teamAScore);
    }

    /*team B button listeners*/

    public void pyramidGoalB(View view) {
        teamBScore = teamBScore + 7;
        displayforTeamB(teamBScore);
    }

    public void fieldThrowB(View view) {
        teamBScore = teamBScore + 3;
        displayforTeamB(teamBScore);
    }

    public void rampGoalB(View view) {
        teamBScore = teamBScore + 10;
        displayforTeamB(teamBScore);
    }

    public void reset(View view) {
        teamAScore = 0;
        teamBScore = 0;
        displayforTeamA(teamAScore);
        displayforTeamB(teamBScore);
    }





    /*Score display methods for teams A and B respectively*/

    public void displayforTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayforTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
