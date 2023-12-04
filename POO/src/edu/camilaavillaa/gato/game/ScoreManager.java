package edu.camilaavillaa.gato.game;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.*;

/**
 * La clase `ScoreManager` gestiona y realiza el seguimiento de los puntajes de los jugadores en un juego.
 * Permite actualizar los puntajes, mostrar los puntajes, guardar los puntajes en un archivo y mostrar rankings.
 */

public class ScoreManager {
    private Map<String, Player> playerMap;
    /**
     * Constructor de la clase `ScoreManager`. Inicializa el mapa de jugadores.
     */
    public ScoreManager() {
        playerMap = new HashMap<>();
    }

    public void updateScores(Player player1, Player player2) {
        updatePlayerScore(player1);
        updatePlayerScore(player2);
    }

    private void updatePlayerScore(Player player) {
        if (playerMap.containsKey(player.getName())) {
            Player existingPlayer = playerMap.get(player.getName());
            existingPlayer.incrementScore(player.getScore());
        } else {
            playerMap.put(player.getName(), player);
        }
    }
    /**
     * Muestra los puntajes de todos los jugadores en la consola.
     */
    public void displayScores() {
        for (Player player : playerMap.values()) {
            System.out.println(player.getName() + ": " + player.getScore() + " points");
        }
    }
    /**
     * Guarda los puntajes de los jugadores en un archivo llamado "puntuaciones.txt".
     * Si ocurre un error durante la escritura, se imprime un mensaje de error en la consola.
     */
    public void saveScoresToFile() {
        try (Writer writer = new FileWriter("puntuaciones.txt")) {
            for (Player player : playerMap.values()) {
                writer.write(player.getName() + "," + player.getScore() + "\n");
            }
        } catch (IOException e) {
            System.err.println("Error saving scores to file: " + e.getMessage());
        }
    }
    /**
     * Muestra los rankings de los jugadores ordenados por puntaje en la consola.
     */
    public void displayRankings() {
        List<Player> rankedPlayers = new ArrayList<>(playerMap.values());
        rankedPlayers.sort(Comparator.comparingInt(Player::getScore).reversed());

        System.out.println("Rankings:");
        for (int i = 0; i < rankedPlayers.size(); i++) {
            Player player = rankedPlayers.get(i);
            System.out.println((i + 1) + ": " + player.getName() + ": " + player.getScore() + " points");
        }
    }
}
