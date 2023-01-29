

public class Competition {
    public static void main(String...args) {

        Programmer p1 = new Programmer();
        Programmer p2 = new Programmer();



        Team team1 = new Team();
        team1.teamName = "Team A";
        team1.p1.name = "Giorgio";
        team1.p1.programmingLanguage="Python, Javascript";
        team1.p1.yearsOfExperience= 10;

        team1.p2.name = "Carlo";
        team1.p2.programmingLanguage="C++";
        team1.p2.yearsOfExperience= 5;



        Programmer p3 = new Programmer();
        Programmer p4 = new Programmer();


        Team team2 = new Team();
        team2.teamName = "Team B";
        team2.p1.name = "Luca";
        team2.p1.programmingLanguage="Java, Javascript";
        team2.p1.yearsOfExperience= 7;

        team2.p2.name = "Simone";
        team2.p2.programmingLanguage="Java, Python; C++";
        team2.p2.yearsOfExperience= 15;






        System.out.println("Team A: ");
        team1.printTeamDetails();
        System.out.println("Team B: ");
        team2.printTeamDetails();


    }
}






