package com.kodilla.rps;

import java.util.Random;

public class RPSGame {
    public static final int ROCK = 1;
    public static final int SCISSORS = 2;
    public static final int PAPER = 3;
    public static final int LIZARD = 4;
    public static final int SPOCK = 5;
    public static final int QUIT = -1;
    public static final String HUMAN = "human";
    public static final String COMPUTER = "computer";
    public static final String NOBODY = "nobody";

    private int numberOfGames;
    private int computerScore;
    private int humanScore;

    public String game() {
        int gameNumber = 0;
        while (gameNumber < numberOfGames) {
            int selectedRPS = UserInput.getRPS();
            if (selectedRPS == QUIT) {
                return NOBODY;
            }
            int computerRPS = randomizeRPS();
            System.out.println("Game #" + gameNumber);
            System.out.println("Human selected: " + convertToText(selectedRPS));
            System.out.println("Computer selected: " + convertToText(computerRPS));
            String winner = calculateWinner(selectedRPS, computerRPS);
            if (winner.equals(HUMAN)) {
                humanScore++;
            } else if (winner.equals(COMPUTER)) {
                computerScore++;
            } else {
                humanScore++;
                computerScore++;
            }
            System.out.println("The winner is: " + winner);
            System.out.println("Human score: " + humanScore);
            System.out.println("Computer score: " + computerScore);
            System.out.println("================================");
            gameNumber++;
        }
        return humanScore > computerScore ? HUMAN : humanScore == computerScore ? NOBODY : COMPUTER;
    }

    private String calculateWinner(int selectedRPS, int computerRPS) {
        if (selectedRPS == SCISSORS) {
            switch (computerRPS) {
                case SCISSORS: return NOBODY;
                case ROCK: return COMPUTER;
                case LIZARD: return HUMAN;
                case SPOCK: return COMPUTER;
                default: return HUMAN;
            }
        } else if (selectedRPS == ROCK) {
            switch (computerRPS) {
                case ROCK: return NOBODY;
                case PAPER: return COMPUTER;
                case LIZARD: return HUMAN;
                case SPOCK: return COMPUTER;
                default: return HUMAN;
            }
        } else if (selectedRPS == LIZARD) {
            switch (computerRPS) {
                case LIZARD: return NOBODY;
                case PAPER: return HUMAN;
                case ROCK: return COMPUTER;
                case SPOCK: return HUMAN;
                default: return HUMAN;
            }
        } else if (selectedRPS == SPOCK) {
            switch (computerRPS) {
                case SPOCK: return NOBODY;
                case PAPER: return COMPUTER;
                case LIZARD: return COMPUTER;
                case ROCK: return HUMAN;
                default: return HUMAN;
            }
        } else {
            switch (computerRPS) {
                case PAPER: return NOBODY;
                case SCISSORS: return COMPUTER;
                case LIZARD: return COMPUTER;
                case SPOCK: return HUMAN;
                default: return HUMAN;
            }
        }
    }

    private String convertToText(int selectedRPS) {
        switch (selectedRPS) {
            case PAPER: return "paper";
            case SCISSORS: return "scissors";
            case ROCK: return "rock";
            case LIZARD: return "lizard";
            case SPOCK: return "spock";
            default: return "";
        }
    }

    private int randomizeRPS() {
        Random random = new Random();
        return random.nextInt(5)+1;
    }

    public RPSGame(int numberOfGames) {
        this.numberOfGames = numberOfGames;
    }
}
