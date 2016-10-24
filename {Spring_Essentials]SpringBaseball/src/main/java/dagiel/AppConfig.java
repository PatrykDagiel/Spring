package dagiel;

import dagiel.entities.BaseballGame;
import dagiel.entities.*;
import dagiel.entities.RedSox;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.sql.DataSource;

/**
 * Created by PatrykDagiel on 20.10.2016.
 */

@Configuration
@Import(InfrastructureConfig.class)
public class AppConfig {
    @Bean
    public Game game(DataSource dataSource) {
        BaseballGame baseballGame = new BaseballGame(redSox(), cubs());
        baseballGame.setDataSource();
        return baseballGame;
    }

    @Bean
    public Team redSox() {
        return new RedSox();
    }

    @Bean
    public Team cubs() {
        return new Cubs();
    }


}
