package view;

import model.Player;
import java.util.List;

public class PlayerView {

    public void displayPlayer(Player player) {
        System.out.println("ID: " + player.getId() +
                           ", Name: " + player.getName() +
                           ", Team: " + player.getTeam() +
                           ", Role: " + player.getRole() +
                           ", Runs: " + player.getRuns() +
                           ", Wickets: " + player.getWickets());
    }

    public void displayTeamRoster(List<Player> players, String team) {
        System.out.println("Team: " + team);
        for (Player p : players) {
            if (p.getTeam().equalsIgnoreCase(team)) {
                displayPlayer(p);
            }
        }
    }
}
