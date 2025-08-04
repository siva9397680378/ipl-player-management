package controller;

import model.Player;
import java.util.ArrayList;
import java.util.List;

public class PlayerController {
    private List<Player> playerList = new ArrayList<>();

    public void addPlayer(Player player) {
        playerList.add(player);
    }

    public void updateStats(int id, int runs, int wickets) {
        for (Player p : playerList) {
            if (p.getId() == id) {
                p.setRuns(runs);
                p.setWickets(wickets);
                break;
            }
        }
    }

    public Player getPlayerById(int id) {
        for (Player p : playerList) {
            if (p.getId() == id) return p;
        }
        return null;
    }

    public List<Player> getPlayersByTeam(String team) {
        List<Player> teamPlayers = new ArrayList<>();
        for (Player p : playerList) {
            if (p.getTeam().equalsIgnoreCase(team)) {
                teamPlayers.add(p);
            }
        }
        return teamPlayers;
    }

    public Player getTopScorer() {
        return playerList.stream().max((a, b) -> Integer.compare(a.getRuns(), b.getRuns())).orElse(null);
    }

    public Player getTopWicketTaker() {
        return playerList.stream().max((a, b) -> Integer.compare(a.getWickets(), b.getWickets())).orElse(null);
    }

    public List<Player> getAllPlayers() {
        return playerList;
    }
}
