package dagiel.entities;

import javax.activation.DataSource;

/**
 * Created by PatrykDagiel on 20.10.2016.
 */
public interface Game {
    String playGame();
    Team getHomeTeam();

    Team getAwayTeam();
}
