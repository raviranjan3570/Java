package com.company;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team <T>> {

    private String name;
    private int played = 0;
    private int won = 0;
    private int lost = 0;
    private int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){

        if(members.contains(player)){

            System.out.println(player.getName() + " is already on the team");
            return false;
        }

        else {

            members.add(player);
            System.out.println(player.getName() + " picked for team " + this.name);
            return true;
        }
    }

    public int numberOfPlayer(){

        return this.members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore){

        String message;

        if(ourScore < theirScore){

            lost++;
            message = "lost to";
        }
        else if(ourScore > theirScore){

            won++;
            message = "beat";
        }

        else{

            tied++;
            message = "drew with";
        }
        played++;
        if(opponent != null){

            System.out.println(this.getName() + " " + message + " " + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking(){

        return (won * 2) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {

        return Integer.compare(team.ranking(), this.ranking());
    }
}
