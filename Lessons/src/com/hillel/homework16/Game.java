package com.hillel.homework16;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private User user;
    private Computer computer;
    private int userScore;
    private int computerScore;
    private int numberOfGames;

    private enum Move {
        ROCK, PAPER, SCISSORS;


        public int compareMoves(Move otherMove) {
            if (this == otherMove)
                return 0;
            switch (this) {
                case ROCK:
                    return (otherMove == SCISSORS ? 1 : -1);
                case PAPER:
                    return (otherMove == ROCK ? 1 : -1);
                case SCISSORS:
                    return (otherMove == PAPER ? 1 : -1);
            }
            return 0;
        }
    }


    private class User {
        private Scanner s;

        public User() {
            s = new Scanner(System.in);
        }

        public Move getUserMove() {
            System.out.println("Rock, paper or scissors?");
            String userInput = s.nextLine();
            userInput = userInput.toUpperCase();
            char firstLetter = userInput.charAt(0);
            if (firstLetter == 'R' || firstLetter == 'P' || firstLetter == 'S') {
                switch (firstLetter) {
                    case 'R':
                        return Move.ROCK;
                    case 'P':
                        return Move.PAPER;
                    case 'S':
                        return Move.SCISSORS;
                }
            }
            return getUserMove();
        }

        public boolean playAgain() {
            System.out.println("Do you want to play again?");
            String userInput = s.nextLine();
            userInput = userInput.toUpperCase();
            return userInput.charAt(0) == 'Y';
        }
    }

    private class Computer {
        public Move getMove() {
            Move[] moves = Move.values();
            Random r = new Random();
            int index = r.nextInt(moves.length);
            return moves[index];
        }
    }


    public Game() {
        user = new User();
        computer = new Computer();
        userScore = 0;
        computerScore = 0;
        numberOfGames = 0;

    }

    public void startGame() {
        System.out.println("Lets Start Game!");

        Move userMove = user.getUserMove();
        Move computerMove = computer.getMove();
        System.out.println("\nYour turn " + userMove + ".");
        System.out.println("Computer turn " + computerMove + ".\n");

        int compareMoves = userMove.compareMoves(computerMove);
        switch (compareMoves) {
            case 0:
                System.out.println("Tie!");
                break;
            case 1:
                System.out.println(userMove + " beats " + computerMove + ". You WIN!");
                userScore++;
                break;
            case -1:
                System.out.println(computerMove + " beats " + userMove + ". You LOSE!");
                computerScore++;
                break;
        }
        numberOfGames++;

        if (user.playAgain()) {
            System.out.println();
            startGame();
        } else {
            printGameStats();
        }
    }

    private void printGameStats() {
        int wins = userScore;
        int losses = computerScore;
        int ties = numberOfGames - userScore - computerScore;

        System.out.println("You win " + wins + " times. You lose " + losses + " times. and there was " + ties + " ties.");

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("result.txt", true));
            String statString = "You win " + wins + " times. You lose " + losses + " times. and there was " + ties + " ties.\n";
            writer.append(statString);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        Game game = new Game();
        game.startGame();

    }
}
