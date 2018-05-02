package com.example.android.golfstrokes;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int stroke_total = 0;
    int stroke_1 = 0;
    int stroke_2 = 0;
    int stroke_3 = 0;
    int stroke_4 = 0;
    int stroke_5 = 0;
    int stroke_6 = 0;
    int stroke_7 = 0;
    int stroke_8 = 0;
    int stroke_9 = 0;

    int putt_total = 0;
    int putt_1 = 0;
    int putt_2 = 0;
    int putt_3 = 0;
    int putt_4 = 0;
    int putt_5 = 0;
    int putt_6 = 0;
    int putt_7 = 0;
    int putt_8 = 0;
    int putt_9 = 0;

    int total_score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * Displays the total score for round
     */
    public void displayTotalScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.total_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the full strokes for each hole
     */
    public void displayStrokesTotal(int score) {
        TextView scoreView = (TextView) findViewById(R.id.full_strokes);
        scoreView.setText(String.valueOf(score));
    }

    public void displayStrokes1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.stroke_1);
        scoreView.setText(String.valueOf(score));
    }

    public void displayStrokes2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.stroke_2);
        scoreView.setText(String.valueOf(score));
    }

    public void displayStrokes3(int score) {
        TextView scoreView = (TextView) findViewById(R.id.stroke_3);
        scoreView.setText(String.valueOf(score));
    }

    public void displayStrokes4(int score) {
        TextView scoreView = (TextView) findViewById(R.id.stroke_4);
        scoreView.setText(String.valueOf(score));
    }

    public void displayStrokes5(int score) {
        TextView scoreView = (TextView) findViewById(R.id.stroke_5);
        scoreView.setText(String.valueOf(score));
    }

    public void displayStrokes6(int score) {
        TextView scoreView = (TextView) findViewById(R.id.stroke_6);
        scoreView.setText(String.valueOf(score));
    }

    public void displayStrokes7(int score) {
        TextView scoreView = (TextView) findViewById(R.id.stroke_7);
        scoreView.setText(String.valueOf(score));
    }

    public void displayStrokes8(int score) {
        TextView scoreView = (TextView) findViewById(R.id.stroke_8);
        scoreView.setText(String.valueOf(score));
    }

    public void displayStrokes9(int score) {
        TextView scoreView = (TextView) findViewById(R.id.stroke_9);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the putts for each hole
     */
    public void displayPuttsTotal(int score) {
        TextView scoreView = (TextView) findViewById(R.id.putts);
        scoreView.setText(String.valueOf(score));
    }

    public void displayPutts1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.putt_1);
        scoreView.setText(String.valueOf(score));
    }

    public void displayPutts2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.putt_2);
        scoreView.setText(String.valueOf(score));
    }

    public void displayPutts3(int score) {
        TextView scoreView = (TextView) findViewById(R.id.putt_3);
        scoreView.setText(String.valueOf(score));
    }

    public void displayPutts4(int score) {
        TextView scoreView = (TextView) findViewById(R.id.putt_4);
        scoreView.setText(String.valueOf(score));
    }

    public void displayPutts5(int score) {
        TextView scoreView = (TextView) findViewById(R.id.putt_5);
        scoreView.setText(String.valueOf(score));
    }

    public void displayPutts6(int score) {
        TextView scoreView = (TextView) findViewById(R.id.putt_6);
        scoreView.setText(String.valueOf(score));
    }

    public void displayPutts7(int score) {
        TextView scoreView = (TextView) findViewById(R.id.putt_7);
        scoreView.setText(String.valueOf(score));
    }

    public void displayPutts8(int score) {
        TextView scoreView = (TextView) findViewById(R.id.putt_8);
        scoreView.setText(String.valueOf(score));
    }

    public void displayPutts9(int score) {
        TextView scoreView = (TextView) findViewById(R.id.putt_9);
        scoreView.setText(String.valueOf(score));
    }


    public void addStrokeHole1(View view) {
        stroke_total += 1;
        stroke_1 += 1;
        total_score += 1;
        displayTotalScore(total_score);
        displayStrokesTotal(stroke_total);
        displayStrokes1(stroke_1);
    }

    public void addStrokeHole2(View view) {
        stroke_total += 1;
        stroke_2 += 1;
        total_score += 1;
        displayTotalScore(total_score);
        displayStrokesTotal(stroke_total);
        displayStrokes2(stroke_2);
    }

    public void addStrokeHole3(View view) {
        stroke_total += 1;
        stroke_3 += 1;
        total_score += 1;
        displayTotalScore(total_score);
        displayStrokesTotal(stroke_total);
        displayStrokes3(stroke_3);
    }

    public void addStrokeHole4(View view) {
        stroke_total += 1;
        stroke_4 += 1;
        total_score += 1;
        displayTotalScore(total_score);
        displayStrokesTotal(stroke_total);
        displayStrokes4(stroke_4);
    }

    public void addStrokeHole5(View view) {
        stroke_total += 1;
        stroke_5 += 1;
        total_score += 1;
        displayTotalScore(total_score);
        displayStrokesTotal(stroke_total);
        displayStrokes5(stroke_5);
    }

    public void addStrokeHole6(View view) {
        stroke_total += 1;
        stroke_6 += 1;
        total_score += 1;
        displayTotalScore(total_score);
        displayStrokesTotal(stroke_total);
        displayStrokes6(stroke_6);
    }

    public void addStrokeHole7(View view) {
        stroke_total += 1;
        stroke_7 += 1;
        total_score += 1;
        displayTotalScore(total_score);
        displayStrokesTotal(stroke_total);
        displayStrokes7(stroke_7);
    }

    public void addStrokeHole8(View view) {
        stroke_total += 1;
        stroke_8 += 1;
        total_score += 1;
        displayTotalScore(total_score);
        displayStrokesTotal(stroke_total);
        displayStrokes8(stroke_8);
    }

    public void addStrokeHole9(View view) {
        stroke_total += 1;
        stroke_9 += 1;
        total_score += 1;
        displayTotalScore(total_score);
        displayStrokesTotal(stroke_total);
        displayStrokes9(stroke_9);
    }


    public void minusStrokeHole1(View view) {
        stroke_total -= 1;
        stroke_1 -= 1;
        total_score -= 1;
        displayTotalScore(total_score);
        displayStrokesTotal(stroke_total);
        displayStrokes1(stroke_1);
    }

    public void minusStrokeHole2(View view) {
        stroke_total -= 1;
        stroke_2 -= 1;
        total_score -= 1;
        displayTotalScore(total_score);
        displayStrokesTotal(stroke_total);
        displayStrokes2(stroke_2);
    }

    public void minusStrokeHole3(View view) {
        stroke_total -= 1;
        stroke_3 -= 1;
        total_score -= 1;
        displayTotalScore(total_score);
        displayStrokesTotal(stroke_total);
        displayStrokes3(stroke_3);
    }

    public void minusStrokeHole4(View view) {
        stroke_total -= 1;
        stroke_4 -= 1;
        total_score -= 1;
        displayTotalScore(total_score);
        displayStrokesTotal(stroke_total);
        displayStrokes4(stroke_4);
    }

    public void minusStrokeHole5(View view) {
        stroke_total -= 1;
        stroke_5 -= 1;
        total_score -= 1;
        displayTotalScore(total_score);
        displayStrokesTotal(stroke_total);
        displayStrokes5(stroke_5);
    }

    public void minusStrokeHole6(View view) {
        stroke_total -= 1;
        stroke_6 -= 1;
        total_score -= 1;
        displayTotalScore(total_score);
        displayStrokesTotal(stroke_total);
        displayStrokes6(stroke_6);
    }

    public void minusStrokeHole7(View view) {
        stroke_total -= 1;
        stroke_7 -= 1;
        total_score -= 1;
        displayTotalScore(total_score);
        displayStrokesTotal(stroke_total);
        displayStrokes7(stroke_7);
    }

    public void minusStrokeHole8(View view) {
        stroke_total -= 1;
        stroke_8 -= 1;
        total_score -= 1;
        displayTotalScore(total_score);
        displayStrokesTotal(stroke_total);
        displayStrokes8(stroke_8);
    }

    public void minusStrokeHole9(View view) {
        stroke_total -= 1;
        stroke_9 -= 1;
        total_score -= 1;
        displayTotalScore(total_score);
        displayStrokesTotal(stroke_total);
        displayStrokes9(stroke_9);
    }

    
    public void addPuttHole1(View view) {
        putt_total += 1;
        putt_1 += 1;
        total_score += 1;
        displayTotalScore(total_score);
        displayPuttsTotal(putt_total);
        displayPutts1(putt_1);
    }

    public void addPuttHole2(View view) {
        putt_total += 1;
        putt_2 += 1;
        total_score += 1;
        displayTotalScore(total_score);
        displayPuttsTotal(putt_total);
        displayPutts2(putt_2);
    }


    public void addPuttHole3(View view) {
        putt_total += 1;
        putt_3 += 1;
        total_score += 1;
        displayTotalScore(total_score);
        displayPuttsTotal(putt_total);
        displayPutts3(putt_3);
    }

    public void addPuttHole4(View view) {
        putt_total += 1;
        putt_4 += 1;
        total_score += 1;
        displayTotalScore(total_score);
        displayPuttsTotal(putt_total);
        displayPutts4(putt_4);
    }

    public void addPuttHole5(View view) {
        putt_total += 1;
        putt_5 += 1;
        total_score += 1;
        displayTotalScore(total_score);
        displayPuttsTotal(putt_total);
        displayPutts5(putt_5);
    }

    public void addPuttHole6(View view) {
        putt_total += 1;
        putt_6 += 1;
        total_score += 1;
        displayTotalScore(total_score);
        displayPuttsTotal(putt_total);
        displayPutts6(putt_6);
    }

    public void addPuttHole7(View view) {
        putt_total += 1;
        putt_7 += 1;
        total_score += 1;
        displayTotalScore(total_score);
        displayPuttsTotal(putt_total);
        displayPutts7(putt_7);
    }

    public void addPuttHole8(View view) {
        putt_total += 1;
        putt_8 += 1;
        total_score += 1;
        displayTotalScore(total_score);
        displayPuttsTotal(putt_total);
        displayPutts8(putt_8);
    }

    public void addPuttHole9(View view) {
        putt_total += 1;
        putt_9 += 1;
        total_score += 1;
        displayTotalScore(total_score);
        displayPuttsTotal(putt_total);
        displayPutts9(putt_9);
    }

    public void minusPuttHole1(View view) {
        putt_total -= 1;
        putt_1 -= 1;
        total_score -= 1;
        displayTotalScore(total_score);
        displayPuttsTotal(putt_total);
        displayPutts1(putt_1);
    }

    public void minusPuttHole2(View view) {
        putt_total -= 1;
        putt_2 -= 1;
        total_score -= 1;
        displayTotalScore(total_score);
        displayPuttsTotal(putt_total);
        displayPutts2(putt_2);
    }


    public void minusPuttHole3(View view) {
        putt_total -= 1;
        putt_3 -= 1;
        total_score -= 1;
        displayTotalScore(total_score);
        displayPuttsTotal(putt_total);
        displayPutts3(putt_3);
    }

    public void minusPuttHole4(View view) {
        putt_total -= 1;
        putt_4 -= 1;
        total_score -= 1;
        displayTotalScore(total_score);
        displayPuttsTotal(putt_total);
        displayPutts4(putt_4);
    }

    public void minusPuttHole5(View view) {
        putt_total -= 1;
        putt_5 -= 1;
        total_score -= 1;
        displayTotalScore(total_score);
        displayPuttsTotal(putt_total);
        displayPutts5(putt_5);
    }

    public void minusPuttHole6(View view) {
        putt_total -= 1;
        putt_6 -= 1;
        total_score -= 1;
        displayTotalScore(total_score);
        displayPuttsTotal(putt_total);
        displayPutts6(putt_6);
    }

    public void minusPuttHole7(View view) {
        putt_total -= 1;
        putt_7 -= 1;
        total_score -= 1;
        displayTotalScore(total_score);
        displayPuttsTotal(putt_total);
        displayPutts7(putt_7);
    }

    public void minusPuttHole8(View view) {
        putt_total -= 1;
        putt_8 -= 1;
        total_score -= 1;
        displayTotalScore(total_score);
        displayPuttsTotal(putt_total);
        displayPutts8(putt_8);
    }

    public void minusPuttHole9(View view) {
        putt_total -= 1;
        putt_9 -= 1;
        total_score -= 1;
        displayTotalScore(total_score);
        displayPuttsTotal(putt_total);
        displayPutts9(putt_9);
    }


    public void resetScores(View view) {
        stroke_1 = 0;
        stroke_2 = 0;
        stroke_3 = 0;
        stroke_4 = 0;
        stroke_5 = 0;
        stroke_6 = 0;
        stroke_7 = 0;
        stroke_8 = 0;
        stroke_9 = 0;
        stroke_total = 0;
        putt_1 = 0;
        putt_2 = 0;
        putt_3 = 0;
        putt_4 = 0;
        putt_5 = 0;
        putt_6 = 0;
        putt_7 = 0;
        putt_8 = 0;
        putt_9 = 0;
        putt_total = 0;
        total_score = 0;
        displayStrokes1(stroke_1);
        displayStrokes2(stroke_2);
        displayStrokes3(stroke_3);
        displayStrokes4(stroke_4);
        displayStrokes5(stroke_5);
        displayStrokes6(stroke_6);
        displayStrokes7(stroke_7);
        displayStrokes8(stroke_8);
        displayStrokes9(stroke_9);
        displayStrokesTotal(stroke_total);
        displayPutts1(putt_1);
        displayPutts2(putt_2);
        displayPutts3(putt_3);
        displayPutts4(putt_4);
        displayPutts5(putt_5);
        displayPutts6(putt_6);
        displayPutts7(putt_7);
        displayPutts8(putt_8);
        displayPutts9(putt_9);
        displayPuttsTotal(putt_total);
        displayTotalScore(total_score);
    }
}