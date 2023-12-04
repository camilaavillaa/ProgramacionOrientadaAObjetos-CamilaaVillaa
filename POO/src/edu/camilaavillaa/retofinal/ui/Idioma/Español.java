package edu.camilaavillaa.retofinal.ui.Idioma;
/**
 * La clase `Español` implementa la interfaz `Lenguaje` y proporciona mensajes internacionalizados en español.
 */
public class Español implements Lenguaje {
    /**
     * Obtiene un mensaje internacionalizado en español para la clave dada.
     *
     * @param llave La clave del mensaje.
     * @return El mensaje internacionalizado en español.
     */
    @Override
    public String getMensaje(String llave) {
        switch (llave){
            case "welcome":
                return "¡Bienvenidos a Tic-Tac-Toe!";
            case "board_size":
                return "Elija el tamaño del tablero:";
            case "option":
                return " Introduzca su elección (1 o 2): ";
            case "play_mode":
                return "Elija una opción:";
            case "player1_name":
                return "Introduzca el nombre del jugador 1: ";
            case "enter_name":
                return "Introduzca el nombre ";
            case "player2_name":
                return "Introduzca el nombre del jugador 2: ";
            case "AI":
                return "2. Jugar contra el ordenador";
            case "human":
                return "1. Jugar contra otro jugador";
            case "loop":
                return  "¿Quieres volver a jugar? (yes/no): ";
            case "player_turn":
                return "Turno de . ";
            case "enter_row_col":
                return "Ingrese fila y columna (e.g., 1 2): ";
            case "invalid_move":
                return "Movimiento inválido. Intente de nuevo: ";
            case "player_wins":
                return "¡ gana!";
            case "game_draw":
                return "¡Es un empate!";
            case "game_over":
                return "¡Juego terminado!";

            default:
                return "Mensaje no encontrado";
        }
    }
}
