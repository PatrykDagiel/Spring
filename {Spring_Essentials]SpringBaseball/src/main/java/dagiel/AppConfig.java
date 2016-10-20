package dagiel;

import dagiel.entities.BaseballGame;
import dagiel.entities.*;
import dagiel.entities.RedSox;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by PatrykDagiel on 20.10.2016.
 */

@Configuration
public class AppConfig {
    @Bean
    public Game game() {
        return new BaseballGame(redSox(), cubs());
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
