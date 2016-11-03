package dagiel;

import dagiel.entities.BaseballGame;
import dagiel.entities.*;
import dagiel.entities.RedSox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.text.NumberFormat;
import java.util.List;


/**
 * Created by PatrykDagiel on 20.10.2016.
 */

//What often happens is you make package for each type
// you want to be found on a component scan
// @Resource - autowire by name
// After "Types of Advice"


@Configuration
@ComponentScan(basePackages = "dagiel")
@EnableAspectJAutoProxy
public class AppConfig {
    //Autowire - by type first
    @Autowired
    private DataSource dataSource;
    @Autowired
    private List<Team> teams;

//    @Resource
//    private Team cubs;
//@Scope -> every time I call a bean, give me a new one - reinitialize

    @Bean
    public NumberFormat nf() {
        return NumberFormat.getCurrencyInstance();
    }


    @Bean/*(initMethod = "startGame", destroyMethod = "endGame")*/
    @Scope("prototype")
    public Game game() {
        BaseballGame baseballGame = new BaseballGame(teams.get(0), teams.get(1));
        baseballGame.setDataSource(dataSource);
        return baseballGame;
    }



}
