package com.company;

public class Main {

    public static void main(String[] args) {

        League<Team<SoccerPlayer>> soccerLeague = new League<>("AFL");
        Team<SoccerPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<SoccerPlayer> melbourne = new Team<>("Melbourne");
        Team<SoccerPlayer> hawthorn = new Team<>("Hawthorn");

        soccerLeague.add(adelaideCrows);
        soccerLeague.add(melbourne);
        soccerLeague.add(hawthorn);

        hawthorn.matchResult(adelaideCrows, 3, 8);
        adelaideCrows.matchResult(melbourne, 2, 1);
        melbourne.matchResult(hawthorn, 1, 0);

        soccerLeague.showLeagueTable();
    }
}
