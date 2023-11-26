package edu.camilaavillaa.retofinal.ui;

import edu.camilaavillaa.retofinal.game.*;

import java.util.Scanner;

public class CLI {
    public static void  startGame (){
        ScoreManager scoreManager = new ScoreManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to Tic-Tac-Toe!");
            System.out.println("Choose the board size:");
            System.out.println("1. 3x3");
            System.out.println("2. 4x4");
            System.out.println("Enter your choice (1 or 2): ");
            int boardSizeChoice = scanner.nextInt();

            int boardSize;
            if (boardSizeChoice == 1) {
                boardSize = 3;
            } else {
                boardSize = 4;
            }

            System.out.println("Choose an option:");
            System.out.println("1. Play against another player");
            System.out.println("2. Play against computer");
            System.out.println("Enter your choice (1 or 2): ");
            int gameModeChoice = scanner.nextInt();

            Player player1, player2;

            if (gameModeChoice == 1) {
                System.out.println("Enter Player 1's name: ");
                scanner.nextLine();
                String player1Name = scanner.nextLine();
                player1 = new Player(player1Name, 'X');

                System.out.println("Enter Player 2's name: ");
                String player2Name = scanner.nextLine();
                player2 = new Player(player2Name, 'O');
            } else {
                System.out.println("Enter your name: ");
                scanner.nextLine();
                String playerName = scanner.nextLine();
                player1 = new Player(playerName, 'X');
                player2 = new AIPlayer('O');
            }

            Board board = new Board(boardSize);
            LogicGame game = new LogicGame(player1, player2, board);
            game.play();

            scoreManager.updateScores(player1, player2);
            scoreManager.saveScoresToFile();
            scoreManager.displayRankings();

            System.out.println("Scores:");
            scoreManager.displayScores();

            System.out.println("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();

            if (!playAgain.equals("yes")) {
                break;
            }
        }

        scanner.close();
    }
}
