package edu.camilaavillaa.retofinal.game;

import java.util.Random;

public class AIPlayer extends Player{
    private enum AIState {
        CHECK_WIN,
        BLOCK_OPPONENT_WIN,
        RANDOM_MOVE
    }

    private Random random;
    private AIState currentState;

    public AIPlayer(char symbol) {
        super("Computer", symbol);
        random = new Random();
        currentState = AIState.CHECK_WIN;
    }

    public void makeMove(Board board) {
        int size = board.getSize();

        while (true) {
            switch (currentState) {
                case CHECK_WIN:
                    for (int i = 0; i < size; i++) {
                        for (int j = 0; j < size; j++) {
                            if (!board.isCellOccupied(i, j)) {
                                board.markCell(i, j, getSymbol());
                                if (board.isWinner(getSymbol())) {
                                    board.markCell(i, j, '-');
                                    return;
                                }
                                board.markCell(i, j, '-');
                            }
                        }
                    }
                    currentState = AIState.BLOCK_OPPONENT_WIN;
                    break;

                case BLOCK_OPPONENT_WIN:
                    char opponentSymbol = (getSymbol() == 'X') ? 'O' : 'X';

                    for (int i = 0; i < size; i++) {
                        for (int j = 0; j < size; j++) {
                            if (!board.isCellOccupied(i, j)) {
                                board.markCell(i, j, opponentSymbol);
                                if (board.isWinner(opponentSymbol)) {
                                    board.markCell(i, j, getSymbol());
                                    return;
                                }
                                board.markCell(i, j, '-');
                            }
                        }
                    }
                    currentState = AIState.RANDOM_MOVE;
                    break;

                case RANDOM_MOVE:
                    int row, col;

                    do {
                        row = random.nextInt(size);
                        col = random.nextInt(size);
                    } while (board.isCellOccupied(row, col));

                    board.markCell(row, col, getSymbol());
                    currentState = AIState.CHECK_WIN;
                    return;
            }
        }
    }
}
