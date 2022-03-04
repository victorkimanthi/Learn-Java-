package com.company;

public class Main {

    public static void main(String[] args) {
        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");
        Team<FootballPlayer> chelsea = new Team<>("chelsea");
        Team<FootballPlayer> mancity = new Team<>("mancity");
        Team<FootballPlayer> arsenal= new Team<>("arsenal");
        Team<FootballPlayer> liverpool= new Team<>("liverpool");
        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");

        arsenal.matchResult(liverpool, 1, 0);
        arsenal.matchResult(chelsea, 3, 8);

        chelsea.matchResult(liverpool, 2, 1);

        footballLeague.addTeam(chelsea);
        footballLeague.addTeam(mancity);
        footballLeague.addTeam(arsenal);
        footballLeague.addTeam(liverpool);

        //footballLeague.addTeam(baseballTeam);
        footballLeague.showLeagueTable();

        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");
        Team rawTeam = new Team("Raw Team");
        rawTeam.addPlayer(beckham); // unchecked warning
        rawTeam.addPlayer(pat);     // unchecked warning

        footballLeague.addTeam(rawTeam);     // unchecked warning

        League<Team> rawLeague = new League<>("Raw");
        rawLeague.addTeam(chelsea);     // no warning
        rawLeague.addTeam(baseballTeam);    // no warning
        rawLeague.addTeam(rawTeam);         // no warning

        League reallyRaw = new League("Really raw");
        reallyRaw.addTeam(chelsea);     // unchecked warning
        reallyRaw.addTeam(baseballTeam);    // unchecked warning
        reallyRaw.addTeam(rawTeam);         // unchecked warning



    }
}
