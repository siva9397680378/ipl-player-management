import controller.PlayerController;
import model.Player;
import view.PlayerView;

public class Main {
    public static void main(String[] args) {
        PlayerController controller = new PlayerController();
        PlayerView view = new PlayerView();

        // Adding players
        controller.addPlayer(new Player(1, "Virat Kohli", "RCB", "Batsman", 973, 0));
        controller.addPlayer(new Player(2, "Jasprit Bumrah", "MI", "Bowler", 50, 20));
        controller.addPlayer(new Player(3, "MS Dhoni", "CSK", "Wicketkeeper", 450, 5));

        // Display all players
        for (Player p : controller.getAllPlayers()) {
            view.displayPlayer(p);
        }

        // Top scorer and wicket-taker
        System.out.println("\nTop Scorer:");
        view.displayPlayer(controller.getTopScorer());

        System.out.println("\nTop Wicket Taker:");
        view.displayPlayer(controller.getTopWicketTaker());
    }
}
