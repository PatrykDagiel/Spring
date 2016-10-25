package dagiel.entities;

import org.springframework.stereotype.Component;

/**
 * Created by PatrykDagiel on 20.10.2016.
 */
@Component
public class Royals implements Team {
    @Override
    public String getName() {
        return "Kansas Royals";
    }
}
