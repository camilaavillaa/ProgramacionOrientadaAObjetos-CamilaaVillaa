package edu.camilaavillaa.retofinal.game;

import java.util.Random;

/**
 * Representa un jugador controlado por la inteligencia artificial para un juego de tablero.
 * Extiende la clase Player para heredar funcionalidades de un jugador genérico.
 */
public class AIPlayer  extends Player{
    /**
     * Enumera los diferentes estados que puede tener la lógica de la IA.
     * CHECK_WIN: Verifica si puede ganar en el siguiente movimiento.
     * BLOCK_OPPONENT_WIN: Intenta bloquear al oponente de ganar en su próximo movimiento.
     * RANDOM_MOVE: Realiza un movimiento aleatorio si no se pueden realizar acciones estratégicas.
     */
    private enum AIState {
        CHECK_WIN,
        BLOCK_OPPONENT_WIN,
        RANDOM_MOVE
    }

    private Random random;
    private AIState currentState; /**
     * Constructor de la clase AIPlayer.
     * @param symbol El símbolo que representará al jugador (X o O).
     */
    public AIPlayer(char symbol) {
        super("Computer", symbol);
        random = new Random();
        currentState = AIState.CHECK_WIN;
    }
    /**
     * Realiza el movimiento de la IA en el tablero dado.
     * @param board El tablero en el que se realizará el movimiento.
     */
    public void makeMove(Board board) {
        int size = board.getSize();

        while (true) {
            switch (currentState) {
                /** Lógica para verificar si puede ganar en el siguiente movimiento
                 * Si es posible, marca la celda y realiza el movimiento
                 * Si no es posible ganar, cambia al estado BLOCK_OPPONENT_WIN
                 */
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
                /** Lógica para bloquear al oponente de ganar en su siguiente movimiento
                 * Si es necesario, bloquea al oponente y realiza el movimiento
                 * Si no es necesario bloquear, cambia al estado RANDOM_MOVE
                 */
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
                /** Movimiento aleatorio si no se pueden realizar acciones estratégicas
                 * Realiza un movimiento aleatorio en el tablero
                 * Cambia al estado CHECK_WIN para el siguiente movimiento estratégico
                 */

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
