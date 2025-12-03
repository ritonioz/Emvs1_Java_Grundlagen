import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Unihockey testTeam = new Unihockey("UHC Visp","Blue",23);
        Unihockey teamA = new Unihockey("UHC Visper Lions","Red",21);
        Unihockey teamB = new Unihockey("UHC Bürchen", "Blue", 17);

        System.out.println("How many Goals did Team A make?");
        teamA.addGoalTeam(scanner.nextShort());
        System.out.println("How many Goals did Team B make?");
        teamB.addGoalTeam(scanner.nextShort());
        teamA.addPenaltyTeam();
        teamA.addPenaltyTeam();
        teamB.addPenaltyTeam();


        teamA.statistic();
        teamB.statistic();
    }
}