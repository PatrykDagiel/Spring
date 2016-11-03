package dagiel.entities;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.sql.DataSource;

/**
 * Created by PatrykDagiel on 20.10.2016.
 */
public class BaseballGame implements Game {
    private Team homeTeam;
    private Team awayTeam;
    private DataSource dataSource;

    public BaseballGame() {}

    public BaseballGame(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }


    public void setHomeTeam(Team homeTeam) {

        this.homeTeam = homeTeam;
    }

    public void setAwayTeam(Team awayTeam) {

        this.awayTeam = awayTeam;
    }

    @Override
    public String playGame() {
        return Math.random() < 0.5 ? getHomeTeam().getName() : getAwayTeam().getName();
    }

    @Override
    public Team getHomeTeam() {
        return homeTeam;
    }

    @Override
    public Team getAwayTeam() {
        return awayTeam;
    }


    @Override
    public String toString() {
        return String.format("Game between %s at %s", homeTeam.getName(), awayTeam.getName());
    }

    @PostConstruct
    public void startGame() {
        System.out.println("Playing national anthem");
    }

    @PreDestroy
    public void endGame() {
        System.out.println("Sending highlights to MBL");
    }



    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
