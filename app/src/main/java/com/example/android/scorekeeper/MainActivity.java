package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int teamAScore = 0;
    private int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void resetScores(View view){
        teamAScore=0;
        teamBScore=0;
        updateTeamAScore();
        updateTeamBScore();
    }

    public void teamAFoul(View view){
        teamAScore -= 2;
        updateTeamAScore();
    }
    public void teamBFoul(View view){
        teamBScore -= 2;
        updateTeamBScore();
    }


    public void teamAGoal(View view){
        teamAScore += 5;
        updateTeamAScore();
    }

    public void teamBGoal(View view){
        teamBScore += 5;
        updateTeamBScore();
    }

    public void updateTeamAScore(){
        TextView teamAScoreBoard = findViewById(R.id.textview_team_A_score);
        teamAScoreBoard.setText(String.valueOf(teamAScore));
    }

    public void updateTeamBScore(){
        TextView teamAScoreBoard = findViewById(R.id.textview_team_B_score);
        teamAScoreBoard.setText(String.valueOf(teamBScore));
    }

}
