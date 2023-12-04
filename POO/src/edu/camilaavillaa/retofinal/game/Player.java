package edu.camilaavillaa.retofinal.game;

/**
 * La clase Player representa un jugador en el juego.
 * Contiene información sobre el nombre del jugador, el símbolo que usa para jugar
 * y su puntuación en el juego.
 */
public class Player {
    private String name;
    private char symbol;
    private int score;
    /**
     * Constructor de la clase Player que inicializa el nombre, el símbolo y la puntuación del jugador.
     *
     * @param name   Nombre del jugador
     * @param symbol Símbolo utilizado por el jugador en el juego
     */
    public Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
        this.score = 0;
    }
    /**
     * Obtiene el nombre del jugador.
     *
     * @return El nombre del jugador
     */
    public String getName() {
        return name;
    }
    /**
     * Obtiene el símbolo utilizado por el jugador en el juego.
     *
     * @return El símbolo del jugador
     */
    public char getSymbol() {
        return symbol;
    }
    /**
     * Obtiene la puntuación actual del jugador en el juego.
     *
     * @return La puntuación del jugador
     */
    public int getScore() {
        return score;
    }
    /**
     * Incrementa la puntuación del jugador en el juego.
     *
     * @param points Puntos a incrementar en la puntuación del jugador
     */
    public void incrementScore(int points) {
        this.score += points;
    }
}