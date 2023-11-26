package edu.camilaavillaa.retofinal.game;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.*;

public class ScoreManager {
    private Map<String, Player> playerMap;

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

    public void displayScores() {
        for (Player player : playerMap.values()) {
            System.out.println(player.getName() + ": " + player.getScore() + " points");
        }
    }

    public void saveScoresToFile() {
        try (Writer writer = new FileWriter("puntuaciones.txt")) {
            for (Player player : playerMap.values()) {
                writer.write(player.getName() + "," + player.getScore() + "\n");
            }
        } catch (IOException e) {
            System.err.println("Error saving scores to file: " + e.getMessage());
        }
    }

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
