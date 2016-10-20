package dagiel;

import dagiel.entities.*;

/**
 * Created by PatrykDagiel on 20.10.2016.
 */
public class RunDemoWithoutSpring {
    public static void main(String[] args) {
        Team redSox = new RedSox();
        Team cubs = new Cubs();
        Team Royals = new Royals();
        Game game = new BaseballGame(redSox, cubs);
        System.out.println(game.playGame());

    }
}
