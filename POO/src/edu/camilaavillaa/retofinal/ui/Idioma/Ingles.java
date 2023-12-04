package edu.camilaavillaa.retofinal.ui.Idioma;
/**
 * La clase `Ingles` implementa la interfaz `Lenguaje` y proporciona mensajes internacionalizados en inglés.
 */
public class Ingles implements Lenguaje {

    /**
     * Obtiene un mensaje internacionalizado en inglés para la clave dada.
     *
     * @param llave La clave del mensaje.
     * @return El mensaje internacionalizado en inglés.
     */
    @Override
    public String getMensaje(String llave) {
        switch (llave) {
            case "welcome":
                return "Welcome to Tic-Tac-Toe!";
            case "board_size":
                return "Choose the board size:";
            case "option":
                return "Enter your choice (1 or 2): ";
            case "play_mode":
                return "Choose an option:";
            case "player1_name":
                return "Enter Player 1's name: ";
            case "enter_name":
                return "Enter  name: ";
            case "player2_name":
                return "Enter Player 2's name: ";
            case "AI":
                return "2. Play against the computer";
            case "human":
                return "1. Play against another player";
            case "loop":
                return "Do you want to play again? (yes/no): ";
            case "player_turn":
                return "It's turn ";
            case "enter_row_col":
                return "Enter row and column (e.g., 1 2): ";
            case "invalid_move":
                return "Invalid move. Try again: ";
            case "player_wins":
                return " wins!";
            case "game_draw":
                return "It's a draw!";
            case "game_over":
                return "Game over!";

            default:
                return "Message not found";
        }

    }

}
