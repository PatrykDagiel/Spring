package dagiel.entities;

import org.springframework.stereotype.Component;

/**
 * Created by PatrykDagiel on 19.10.2016.
 */
//@Component
public class RedSox implements Team {
    @Override
    public String getName() {
        return "Boston RedSox";
    }
}
