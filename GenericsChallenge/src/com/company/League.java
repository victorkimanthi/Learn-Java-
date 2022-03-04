package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
    private String name;

    private ArrayList<T> teams = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public boolean addTeam(T team){
        if(teams.contains(team)){
            System.out.println(team.getName() + " is already in the league");
            return false;
        }else{
            teams.add(team);
            System.out.println(team.getName() + " picked for league " + this.name);
            return true;
        }
    }
    public int numberOfTeams(){
        return teams.size();
    }
    public void showLeagueTable(){
        Collections.sort(teams);
        for(T t : teams){
            System.out.println(t.getName() + " : " + t.ranking());
        }
    }
     
}
