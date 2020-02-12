package com.company;

public class SoccerTeam {
    private int wins, losses, ties;
    private static int games = 0, goals = 0;

    public SoccerTeam() { //default Constructor
        wins = 0;
        losses = 0;
        ties = 0;
    }

    public void played(SoccerTeam other, int myScore, int otherScore) {
        if (myScore > otherScore){
            wins++;
            other.losses++;
        }
        if (myScore < otherScore){
            losses++;
            other.wins++;
        }
        if (myScore == otherScore){
            ties++;
            other.ties++;
        }
        games++;
        goals += myScore + otherScore;
    }

    public int currentPoints() {
        int points = (3 * wins) + (ties);
        return points;
    }

    public void reset() {
        wins = 0;
        losses = 0;
        ties = 0;
    }

    public static void startTournament() {
        games = 0;
        goals = 0;
    }

    public static int getGoals() {
        return goals;
    }

    public static int getGames() {
        return games;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SoccerTeam t1 = new SoccerTeam();
        SoccerTeam t2 = new SoccerTeam();
        SoccerTeam t3 = new SoccerTeam();
        SoccerTeam t4 = new SoccerTeam();

        t1.played(t2, 7, 14);
        t2.played(t3, 2, 4);
        t3.played(t4, 4, 11);
        t4.played(t1, 1, 3);

        System.out.println("First Tournament");
        System.out.println("Total games played : " + getGames() + " & Total goals scored : " + getGoals());
        System.out.println("Team 1 scored " + t1.currentPoints() + " points");
        System.out.println("Team 2 scored " + t2.currentPoints() + " points");
        System.out.println("Team 3 scored " + t3.currentPoints() + " points");
        System.out.println("Team 4 socred " + t4.currentPoints() + " points");

        startTournament();		//new tournament
        t1.reset();
        t2.reset();
        t3.reset();
        t4.reset();
        System.out.println();

        t1.played(t3, 9, 4);
        t2.played(t4, 2, 1);
        t3.played(t2, 1, 5);
        t4.played(t1, 3, 1);
        t1.played(t4, 4, 3);
        t2.played(t3, 1, 2);

        System.out.println("Second Tournament");
        System.out.println("Total games played : " + getGames() + " & Total goals scored : " + getGoals());
        System.out.println("Team 1 scored " + t1.currentPoints() + " points");
        System.out.println("Team 2 scored " + t2.currentPoints() + " points");
        System.out.println("Team 3 scored " + t3.currentPoints() + " points");
        System.out.println("Team 4 scored " + t4.currentPoints() + " points");
    }
}
//Output:
//First Tournament
//    Total games played : 4 & Total goals scored : 46
//        Team 1 scored 3 points
//        Team 2 scored 3 points
//        Team 3 scored 3 points
//        Team 4 socred 3 points
//
//        Second Tournament
//        Total games played : 6 & Total goals scored : 36
//        Team 1 scored 6 points
//        Team 2 scored 6 points
//        Team 3 scored 3 points
//        Team 4 scored 3 points
//
//        Process finished with exit code 0
