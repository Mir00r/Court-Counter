package com.mir00r.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvScoreA, tvScoreB;
    Button btnThreePointTeamA, btnTwoPointTeamA, btnFreeThrowTeamA, btnThreePointTeamB, btnTwoPointTeamB, btnFreeThrowTeamB, btnReset;
    int scoreA = 0, scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        btnThreePointTeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setPoint(3, true);
            }
        });
        btnTwoPointTeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setPoint(2, true);
            }
        });
        btnFreeThrowTeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setPoint(1, true);
            }
        });

        btnThreePointTeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setPoint(3, false);
            }
        });
        btnTwoPointTeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setPoint(2, false);
            }
        });
        btnFreeThrowTeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setPoint(1, false);
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                initScore();
            }
        });
    }

    private void initView() {
        tvScoreA = (TextView) findViewById(R.id.tv_team_a_score);
        tvScoreB = (TextView) findViewById(R.id.tv_team_b_score);

        btnThreePointTeamA = (Button) findViewById(R.id.btn_three_point_a);
        btnTwoPointTeamA = (Button) findViewById(R.id.btn_two_point_a);
        btnFreeThrowTeamA = (Button) findViewById(R.id.btn_free_point_a);

        btnThreePointTeamB = (Button) findViewById(R.id.btn_three_point_b);
        btnTwoPointTeamB = (Button) findViewById(R.id.btn_two_point_b);
        btnFreeThrowTeamB = (Button) findViewById(R.id.btn_free_point_b);

        btnReset = (Button) findViewById(R.id.btn_reset);
    }

    private void initScore() {
        scoreA = 0;
        scoreB = 0;
        tvScoreA.setText("0");
        tvScoreB.setText("0");
    }

    private void setPoint(int point, boolean isTeamA) {
        if (isTeamA) {
            if (point == 3) {
                scoreA += point;
                tvScoreA.setText(String.valueOf(scoreA));
            } else if (point == 2) {
                scoreA += point;
                tvScoreA.setText(String.valueOf(scoreA));
            } else {
                scoreA += point;
                tvScoreA.setText(String.valueOf(scoreA));
            }
        } else {
            if (point == 3) {
                scoreB += point;
                tvScoreB.setText(String.valueOf(scoreB));
            } else if (point == 2) {
                scoreB += point;
                tvScoreB.setText(String.valueOf(scoreB));
            } else {
                scoreB += point;
                tvScoreB.setText(String.valueOf(scoreB));
            }
        }
    }
}
