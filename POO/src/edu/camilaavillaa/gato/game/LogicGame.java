package edu.camilaavillaa.gato.game;

import edu.camilaavillaa.gato.ui.Idioma.LenguajeFactory;

import java.util.Scanner;

/**
 * La clase LogicGame representa la lógica principal de un juego de dos jugadores.
 * Controla el flujo del juego, la alternancia de turnos, las jugadas y determina
 * cuándo termina el juego.
 */
public class LogicGame {
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private Board board;
    /**
     * Constructor de LogicGame que inicializa los jugadores y el tablero.
     *
     * @param player1 Jugador 1
     * @param player2 Jugador 2
     * @param board   Tablero del juego
     */

    public LogicGame(Player player1, Player player2, Board board) {
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = player1;
        this.board = board;
    }
    /**
     * Método principal que inicia el juego y controla el flujo del mismo.
     */
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
    /**
     * Realiza una jugada en el juego actual. Si el jugador actual es una instancia de AIPlayer,
     * se llama al método makeMove() de AIPlayer para realizar la jugada automáticamente.
     * En caso contrario, solicita al jugador actual que ingrese las coordenadas de la jugada por consola.
     * Verifica si la jugada es válida y marca la celda en el tablero correspondiente.
     */

    private void makeMove() {
        if (currentPlayer instanceof AIPlayer) {
            ((AIPlayer) currentPlayer).makeMove(board);
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println( currentPlayer.getName() + ":"+ LenguajeFactory.getMensaje("player_turn"));
            System.out.println(LenguajeFactory.getMensaje("enter_row_col"));

            int row = scanner.nextInt() - 1;
            int col = scanner.nextInt() - 1;

            while (row < 0 || row >= board.getSize() || col < 0 || col >= board.getSize() || board.isCellOccupied(row, col)) {
                System.out.println(LenguajeFactory.getMensaje("invalid_move"));
                row = scanner.nextInt() - 1;
                col = scanner.nextInt() - 1;
            }

            board.markCell(row, col, currentPlayer.getSymbol());
        }
    }
    /**
     * Cambia al siguiente jugador, alternando entre player1 y player2.
     */

    private void switchPlayer() {
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }
    /**
     * Verifica si el juego ha terminado. Comprueba si el jugador actual ha ganado o si el tablero
     * está lleno, lo que resulta en un empate.
     *
     * @return true si el juego ha terminado, false en caso contrario.
     */
    private boolean isGameOver() {
        if (board.isWinner(currentPlayer.getSymbol())) {
            System.out.println(LenguajeFactory.getMensaje("player_wins") + " " + currentPlayer.getName());
            return true;
        } else if (board.isFull()) {
            System.out.println(LenguajeFactory.getMensaje("game_draw"));
            return true;
        }
        return false;
    }
    /**
     * Muestra el resultado final del juego. Muestra el tablero actual y la información
     * sobre quién ha ganado o si el juego terminó en empate.
     * Además, actualiza las puntuaciones de los jugadores según el resultado.
     */
    private void displayResult() {
        board.display();
        System.out.println(LenguajeFactory.getMensaje("game_over"));


        if (board.isWinner(currentPlayer.getSymbol())) {
            System.out.println(LenguajeFactory.getMensaje("player_wins") + " " + currentPlayer.getName());
            currentPlayer.incrementScore(10);
        } else if (board.isFull()) {
            System.out.println(LenguajeFactory.getMensaje("game_draw"));
            player1.incrementScore(1);
            player2.incrementScore(1);
        }
    }
}
