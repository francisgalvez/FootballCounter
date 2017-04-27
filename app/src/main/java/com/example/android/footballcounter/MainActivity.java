package com.example.android.footballcounter;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView goalsView;
    TextView shotsView;
    TextView outsideView;
    TextView cornersView;
    TextView ycardsView;
    TextView rcardsView;

    Team realmadrid = new Team("Real Madrid CF");
    Team barcelona = new Team("FC Barcelona");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //REAL MADRID CODE

    /**
     * Displays Real Madrid's goals
     */
    public void displayRealMadridGoals() {
        goalsView = (TextView) findViewById(R.id.real_madrid_goals);
        goalsView.setText(String.valueOf(realmadrid.getGoals()));
    }

    /**
     * Displays Real Madrid's shots
     */
    public void displayRealMadridShots() {
        shotsView = (TextView) findViewById(R.id.real_madrid_shots);
        shotsView.setText(String.valueOf(realmadrid.getShots()));
    }

    /**
     * Displays Real Madrid's outsides
     */
    public void displayRealMadridOutsides() {
        outsideView = (TextView) findViewById(R.id.real_madrid_outsides);
        outsideView.setText(String.valueOf(realmadrid.getOutsides()));
    }

    /**
     * Displays Real Madrid's corners
     */
    public void displayRealMadridCorners() {
        cornersView = (TextView) findViewById(R.id.real_madrid_corners);
        cornersView.setText(String.valueOf(realmadrid.getCorners()));
    }

    /**
     * Displays Real Madrid's yellow cards
     */
    public void displayRealMadridYellowCards() {
        ycardsView = (TextView) findViewById(R.id.real_madrid_ycards);
        ycardsView.setText(String.valueOf(realmadrid.getYellowCards()));
    }

    /**
     * Displays Real Madrid's red cards
     */
    public void displayRealMadridRedCards() {
        rcardsView = (TextView) findViewById(R.id.real_madrid_rcards);
        rcardsView.setText(String.valueOf(realmadrid.getRedCards()));
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ball_button_rm:
                realmadrid.addGoal();
                this.displayRealMadridGoals();
                break;

            case R.id.rm_corners_button:
                realmadrid.addCorner();
                this.displayRealMadridCorners();
                break;

            case R.id.rm_shots_button:
                realmadrid.addShot();
                this.displayRealMadridShots();
                break;

            case R.id.rm_ycards_button:
                realmadrid.addYellowCard();
                this.displayRealMadridYellowCards();
                break;

            case R.id.rm_rcards_button:
                realmadrid.addRedCard();
                this.displayRealMadridRedCards();
                break;

            case R.id.rm_outsides_button:
                realmadrid.addOutside();
                this.displayRealMadridOutsides();
                break;

            case R.id.reset_button_rm:
                realmadrid.reset();

                displayRealMadridGoals();
                displayRealMadridCorners();
                displayRealMadridOutsides();
                displayRealMadridYellowCards();
                displayRealMadridRedCards();
                displayRealMadridShots();
                break;

            case R.id.ball_button_fcb:
                barcelona.addGoal();
                this.displayBarcelonaGoals();
                break;

            case R.id.fcb_corners_button:
                barcelona.addCorner();
                this.displayBarcelonaCorners();
                break;

            case R.id.fcb_shots_button:
                barcelona.addShot();
                this.displayBarcelonaShots();
                break;

            case R.id.barcelona_ycards_button:
                barcelona.addYellowCard();
                this.displayBarcelonaYellowCards();
                break;

            case R.id.barcelona_rcards_button:
                barcelona.addRedCard();
                this.displayBarcelonaRedCards();
                break;

            case R.id.barcelona_outsides_button:
                barcelona.addOutside();
                this.displayBarcelonaOutsides();
                break;

            case R.id.reset_button_fcb:
                barcelona.reset();

                displayBarcelonaGoals();
                displayBarcelonaCorners();
                displayBarcelonaOutsides();
                displayBarcelonaYellowCards();
                displayBarcelonaRedCards();
                displayBarcelonaShots();
                break;
        }
    }

    //FC BARCELONA CODE

    /**
     * Displays the given score for FC Barcelona.
     */
    public void displayBarcelonaGoals() {
        TextView scoreView = (TextView) findViewById(R.id.barcelona_goals);
        scoreView.setText(String.valueOf(barcelona.getGoals()));
    }

    /**
     * Displays Barcelona's shots
     */
    public void displayBarcelonaShots() {
        TextView scoreView = (TextView) findViewById(R.id.barcelona_shots);
        scoreView.setText(String.valueOf(barcelona.getShots()));
    }

    /**
     * Displays Barcelona's outsides
     */
    public void displayBarcelonaOutsides() {
        TextView scoreView = (TextView) findViewById(R.id.barcelona_outsides);
        scoreView.setText(String.valueOf(barcelona.getOutsides()));
    }

    /**
     * Displays Barcelona's corners
     */
    public void displayBarcelonaCorners() {
        TextView scoreView = (TextView) findViewById(R.id.barcelona_corners);
        scoreView.setText(String.valueOf(barcelona.getCorners()));
    }

    /**
     * Displays Barcelona's yellow cards
     */
    public void displayBarcelonaYellowCards() {
        TextView scoreView = (TextView) findViewById(R.id.barcelona_ycards);
        scoreView.setText(String.valueOf(barcelona.getYellowCards()));
    }

    /**
     * Displays Barcelona's red cards
     */
    public void displayBarcelonaRedCards() {
        TextView scoreView = (TextView) findViewById(R.id.barcelona_rcards);
        scoreView.setText(String.valueOf(barcelona.getRedCards()));
    }
}
