package dagiel;

import dagiel.entities.Game;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by PatrykDagiel on 20.10.2016.
 */
public class RunDemo {
    public static void main(String[] args) {
//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Game game = context.getBean("game", Game.class);
        System.out.println(game.playGame());

        System.out.println("There are " + context.getBeanDefinitionCount() + " beans");
        for(String s : context.getBeanDefinitionNames()) {
            System.out.println(s);
        }

    }
}
