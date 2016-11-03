package dagiel;

import dagiel.entities.Game;
import dagiel.entities.Team;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.NumberFormat;

/**
 * Created by PatrykDagiel on 20.10.2016.
 */
public class RunDemo {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        NumberFormat nf = context.getBean(NumberFormat.class);
//        double amount = 1234567.901234;
//        System.out.println(nf.format(amount));

        Game game = context.getBean("game", Game.class);
        Team royals = context.getBean("royals", Team.class);
        Team cubs = context.getBean("cubs", Team.class);
        Team redSox = context.getBean("redSox", Team.class);

        game.setAwayTeam(royals);
        game.setHomeTeam(cubs);
        System.out.println(game.playGame());

        game.setHomeTeam(redSox);
        game.setAwayTeam(royals);
        System.out.println(game.playGame());


//        System.out.println("There are " + context.getBeanDefinitionCount() + " beans");
//        for(String s : context.getBeanDefinitionNames()) {
//            System.out.println(s);
//        }

    }
}
