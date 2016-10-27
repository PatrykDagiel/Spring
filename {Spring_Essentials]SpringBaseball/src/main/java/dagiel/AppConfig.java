package dagiel;

import dagiel.entities.BaseballGame;
import dagiel.entities.*;
import dagiel.entities.RedSox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.annotation.Resource;
import javax.sql.DataSource;


/**
 * Created by PatrykDagiel on 20.10.2016.
 */

//What often happens is you make package for each type
// you want to be found on a component scan
// @Resource - autowire by name

//@Configuration
//@ComponentScan(basePackages = "dagiel")
public class AppConfig {
    //Autowire - by type first
//    @Autowired
//    private DataSource dataSource;
//
//    @Autowired @Qualifier("redSox")
//    private Team home;
//    @Resource
//    private Team cubs;
//
//    @Bean
//    public Game game() {
//        BaseballGame baseballGame = new BaseballGame(home, cubs);
//        baseballGame.setDataSource(dataSource);
//        return baseballGame;
//    }
//


}
