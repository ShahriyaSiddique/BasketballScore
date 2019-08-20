package com.example.basketballscore;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamAPoints = 0;
    int teamBPoints = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void threePointsToTeamA(View view) {
        teamAPoints = teamAPoints + 3;
        displayTeamAPoints(teamAPoints);
    }

    public void twoPointsToTeamA(View view) {
        teamAPoints = teamAPoints + 2;
        displayTeamAPoints(teamAPoints);
    }

    public void onePointToTeamA(View view) {
        teamAPoints = teamAPoints + 1;
        displayTeamAPoints(teamAPoints);
    }

    /**
     * @param teamAPoints
     */

    private void displayTeamAPoints(int teamAPoints) {
        TextView t = (TextView) findViewById(R.id.team_a_point);
        t.setText(String.valueOf(teamAPoints));
    }

    public void threePointsToTeamB(View view) {
        teamBPoints = teamBPoints + 3;
        displayTeamBPoints(teamBPoints);
    }

    public void twoPointsToTeamB(View view) {
        teamBPoints = teamBPoints + 2;
        displayTeamBPoints(teamBPoints);
    }

    public void onePointToTeamB(View view) {
        teamBPoints = teamBPoints + 1;
        displayTeamBPoints(teamBPoints);
    }

    /**
     *
     * @param teamBPoints is for team points
     */
    private void displayTeamBPoints(int teamBPoints) {
        TextView t = (TextView) findViewById(R.id.team_b_point);
        t.setText(String.valueOf(teamBPoints));
    }


    public void reset(View view) {
        teamAPoints = 0;
        teamBPoints = 0;
        displayTeamAPoints(teamAPoints);
        displayTeamBPoints(teamBPoints);
    }

}
