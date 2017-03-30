package com.example.android.footballcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

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
        TextView scoreView = (TextView) findViewById(R.id.real_madrid_goals);
        scoreView.setText(String.valueOf(realmadrid.getGoals()));
    }

    /**
     * Displays Real Madrid's shots
     */
    public void displayRealMadridShots() {
        TextView scoreView = (TextView) findViewById(R.id.real_madrid_shots);
        scoreView.setText(String.valueOf(realmadrid.getShots()));
    }

    /**
     * Displays Real Madrid's outsides
     */
    public void displayRealMadridOutsides() {
        TextView scoreView = (TextView) findViewById(R.id.real_madrid_outsides);
        scoreView.setText(String.valueOf(realmadrid.getOutsides()));
    }

    /**
     * Displays Real Madrid's corners
     */
    public void displayRealMadridCorners() {
        TextView scoreView = (TextView) findViewById(R.id.real_madrid_corners);
        scoreView.setText(String.valueOf(realmadrid.getCorners()));
    }

    /**
     * Displays Real Madrid's yellow cards
     */
    public void displayRealMadridYellowCards() {
        TextView scoreView = (TextView) findViewById(R.id.real_madrid_ycards);
        scoreView.setText(String.valueOf(realmadrid.getYellowCards()));
    }

    /**
     * Displays Real Madrid's red cards
     */
    public void displayRealMadridRedCards() {
        TextView scoreView = (TextView) findViewById(R.id.real_madrid_rcards);
        scoreView.setText(String.valueOf(realmadrid.getRedCards()));
    }

    /**
     * Adds one goal for Real Madrid
     */
    public void addGoalForRealMadrid(View view){
        realmadrid.addGoal();
        this.displayRealMadridGoals();
    }

    /**
     * Adds one shot for Real Madrid
     */
    public void addShotForRealMadrid(View view){
        realmadrid.addShot();
        this.displayRealMadridShots();
    }

    /**
     * Adds one corner for Real Madrid
     */
    public void addCornerForRealMadrid(View view){
        realmadrid.addCorner();
        this.displayRealMadridCorners();
    }

    /**
     * Adds one yellow card for Real Madrid
     */
    public void addYellowCardForRealMadrid(View view){
        realmadrid.addYellowCard();
        this.displayRealMadridYellowCards();
    }

    /**
     * Adds one red card for Real Madrid
     */
    public void addRedCardForRealMadrid(View view){
        realmadrid.addRedCard();
        this.displayRealMadridRedCards();
    }

    /**
     * Adds one outside for Real Madrid
     */
    public void addOutsideForRealMadrid(View view){
        realmadrid.addOutside();
        this.displayRealMadridOutsides();
    }

    /**
     * Resets all variables for Real Madrid
     */
    public void resetRealMadrid(View view){
        realmadrid.reset();

        displayRealMadridGoals();
        displayRealMadridCorners();
        displayRealMadridOutsides();
        displayRealMadridYellowCards();
        displayRealMadridRedCards();
        displayRealMadridShots();
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

    public void addGoalForBarcelona(View view){
        barcelona.addGoal();
        this.displayBarcelonaGoals();
    }

    public void addShotForBarcelona(View view){
        barcelona.addShot();
        this.displayBarcelonaShots();
    }

    public void addCornerForBarcelona(View view){
        barcelona.addCorner();
        this.displayBarcelonaCorners();
    }

    public void addYellowCardForBarcelona(View view){
        barcelona.addYellowCard();
        this.displayBarcelonaYellowCards();
    }

    public void addRedCardForBarcelona(View view){
        barcelona.addRedCard();
        this.displayBarcelonaRedCards();
    }

    /**
     * Adds one outside for Barcelona
     */
    public void addOutsideForBarcelona(View view){
        barcelona.addOutside();
        this.displayBarcelonaOutsides();
    }

    public void resetBarcelona(View view){
        barcelona.reset();

        displayBarcelonaGoals();
        displayBarcelonaCorners();
        displayBarcelonaOutsides();
        displayBarcelonaYellowCards();
        displayBarcelonaRedCards();
        displayBarcelonaShots();
    }
}
