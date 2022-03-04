package com.company;

public class Main {

    public static void main(String[] args) {
	EnglishTeam arsenal = new EnglishTeam("Arsenal");
    SpanishTeam barcelona = new SpanishTeam("Barcelona");
    ItalianTeam juventus = new ItalianTeam("Juventus");

    League<EnglishTeam> englishLeague = new League<>("EPL");
    League<SpanishTeam> spanishLeague = new League<>("La Liga");
    League<ItalianTeam> italianLeague = new League<>("Italian Series");

    englishLeague.addTeam(arsenal);
    spanishLeague.addTeam(barcelona);
    italianLeague.addTeam(juventus);

        EnglishTeam manchesterUnited = new EnglishTeam(" manchesterUnited ");
        EnglishTeam chelsea = new EnglishTeam("chelsea");
        EnglishTeam manCity = new EnglishTeam(" manCity");
        englishLeague.addTeam(manchesterUnited);
        englishLeague.addTeam(chelsea);
        englishLeague.addTeam(manCity);

        arsenal.matchResult(chelsea, 1, 0);
        arsenal.matchResult(manchesterUnited, 3, 8);

        manchesterUnited.matchResult(chelsea, 2, 1);
        System.out.println(englishLeague.numberOfTeams());

        SpanishTeam realMadrid = new SpanishTeam(" realMadrid");
        SpanishTeam athleticoMadrid = new SpanishTeam("athleticoMadrid");
        spanishLeague.addTeam(realMadrid);
        spanishLeague.addTeam(athleticoMadrid);
        System.out.println(spanishLeague.numberOfTeams());
        //englishLeague.listOfTeams();

        System.out.println(arsenal.getName() + ": " + arsenal.ranking());
        System.out.println(chelsea.getName() + ": " + chelsea.ranking());
        System.out.println(manchesterUnited.getName() + ": " + manchesterUnited.ranking());
        System.out.println(manCity.getName() + ": " + manCity.ranking());



        System.out.println(arsenal.compareTo(chelsea));
        System.out.println(arsenal.compareTo(manchesterUnited));
        System.out.println(chelsea.compareTo(manCity));
        System.out.println(manchesterUnited.compareTo(manCity));

    }
}
