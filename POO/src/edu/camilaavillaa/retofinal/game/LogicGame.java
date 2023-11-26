package edu.camilaavillaa.retofinal.game;

import java.util.Scanner;

public class LogicGame {
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private Board board;

    public LogicGame(Player player1, Player player2, Board board) {
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = player1;
        this.board = board;
    }

    public void play() {
        while (true) {
            board.display();
            makeMove();

            if (isGameOver()) {
                break;
            }

            switchPlayer();
        }

        displayResult();
    }

    private void makeMove() {
        if (currentPlayer instanceof AIPlayer) {
            ((AIPlayer) currentPlayer).makeMove(board);
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println(currentPlayer.getName() + "'s turn. Enter row and column (e.g., 1 2): ");

            int row = scanner.nextInt() - 1;
            int col = scanner.nextInt() - 1;

            while (row < 0 || row >= board.getSize() || col < 0 || col >= board.getSize() || board.isCellOccupied(row, col)) {
                System.out.println("Invalid move. Try again: ");
                row = scanner.nextInt() - 1;
                col = scanner.nextInt() - 1;
            }

            board.markCell(row, col, currentPlayer.getSymbol());
        }
    }

    private void switchPlayer() {
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }

    private boolean isGameOver() {
        if (board.isWinner(currentPlayer.getSymbol())) {
            System.out.println(currentPlayer.getName() + " wins!");
            return true;
        } else if (board.isFull()) {
            System.out.println("It's a draw!");
            return true;
        }
        return false;
    }

    private void displayResult() {
        board.display();
        System.out.println("Game over!");

        if (board.isWinner(currentPlayer.getSymbol())) {
            System.out.println(currentPlayer.getName() + " wins!");
            currentPlayer.incrementScore(10);
        } else if (board.isFull()) {
            System.out.println("It's a draw!");
            player1.incrementScore(1);
            player2.incrementScore(1);
        }
    }
}
