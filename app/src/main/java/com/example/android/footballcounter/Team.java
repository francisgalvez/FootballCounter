package com.example.android.footballcounter;

/**
 * Created by Francis on 29/03/2017.
 */

public class Team {
    private String name;
    private int goals;
    private int shots;
    private int outsides;
    private int corners;
    private int yellowCards;
    private int redCards;

    public Team(String name){
        this.name = name;
        goals = 0;
        shots = 0;
        outsides = 0;
        corners = 0;
        yellowCards = 0;
        redCards = 0;
    }

    public int getOutsides(){
        return outsides;
    }

    public void addOutside(){
        outsides++;
    }

    public int getGoals() {
        return goals;
    }

    public void addGoal() {
        goals++;
    }

    public int getShots() {
        return shots;
    }

    public void addShot() {
        shots++;
    }

    public int getCorners() {
        return corners;
    }

    public void addCorner() {
        corners++;
    }

    public int getYellowCards() {
        return yellowCards;
    }

    public void addYellowCard() {
        yellowCards++;
    }

    public int getRedCards() {
        return redCards;
    }

    public void addRedCard() {
        redCards++;
    }

    public void reset(){
        goals = 0;
        shots = 0;
        outsides = 0;
        corners = 0;
        yellowCards = 0;
        redCards = 0;
    }
}
