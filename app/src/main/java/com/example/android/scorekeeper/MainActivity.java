package com.example.android.scorekeeper;


import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

public class MainActivity extends AppCompatActivity
{

   // int teamAScore = 0;
   // int teamBScore = 0;
    public ScoreViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewModel = ViewModelProviders.of(this).get(ScoreViewModel.class);
        displayforTeamA(mViewModel.scoreTeamA);
        displayforTeamB(mViewModel.scoreTeamB);

    }

    /* These two methods save and restore the variable states when the screen is re-drawn
     * such as when the view rotates */



    /*team A button listeners */

    public void pyramidGoalA(View view) {
        mViewModel.scoreTeamA = mViewModel.scoreTeamA + 7;
        displayforTeamA(mViewModel.scoreTeamA);
    }

    public void fieldThrowA(View view) {
        mViewModel.scoreTeamA = mViewModel.scoreTeamA + 3;
        displayforTeamA(mViewModel.scoreTeamA);
    }

    public void rampGoalA(View view) {
        mViewModel.scoreTeamA = mViewModel.scoreTeamA + 10;
        displayforTeamA(mViewModel.scoreTeamA);
    }

    /*team B button listeners*/

    public void pyramidGoalB(View view) {
        mViewModel.scoreTeamB = mViewModel.scoreTeamB + 7;
        displayforTeamB(mViewModel.scoreTeamB);
    }

    public void fieldThrowB(View view) {
        mViewModel.scoreTeamB = mViewModel.scoreTeamB + 3;
        displayforTeamB(mViewModel.scoreTeamB);
    }

    public void rampGoalB(View view) {
        mViewModel.scoreTeamB = mViewModel.scoreTeamB + 10;
        displayforTeamB(mViewModel.scoreTeamB);
    }

    /* This method resets scores by assigning score varibales a value of zero*/

    public void reset(View view) {
        mViewModel.scoreTeamA = 0;
        mViewModel.scoreTeamB = 0;
        displayforTeamA(mViewModel.scoreTeamA);
        displayforTeamB(mViewModel.scoreTeamB);
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
