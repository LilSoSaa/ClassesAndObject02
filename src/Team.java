public class Team {

    String teamName;
    Programmer p1, p2;

    void printTeamDetails() {
        System.out.println("Team name: " + teamName);
        System.out.println("Programmer 1:");
        p1.printProgrammerDetails();
        System.out.println("Programmer 2:");
        p2.printProgrammerDetails();
    }


}
