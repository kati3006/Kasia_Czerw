package com.kodilla.rps;

import java.util.Scanner;

public class UserInput {
    static public int getNumberOfGames() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("How many games?:");
            int result = 0;
            try {
                result = Integer.parseInt(scanner.nextLine());
            } catch( Exception e) {
                System.out.println("Wrong number.");
            }
            if (result > 0) {
                return result;
            }
        }
    }
    static public int getRPS() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select: (R)ock, (S)cissors, (P)aper, (L)izard, (Sp)ock or select (Q)uit");
            String s = scanner.nextLine().toUpperCase();
            switch (s) {
                case "R": return RPSGame.ROCK;
                case "S": return RPSGame.SCISSORS;
                case "P": return RPSGame.PAPER;
                case "L": return RPSGame.LIZARD;
                case "Sp": return RPSGame.SPOCK;
                case "Q": return RPSGame.QUIT;
                default:
                    System.out.printf("Wrong selection.");
            }
        }
    }
}
