package controller;

import domain.Gamer;
import repository.GamerRepository;

/**
 * This class create a gamer into repository
 *
 * @version 1.0.0 24/04/2022
 * @author Jhonny Castro johnny.castro@misena.edu.co
 * @author Lorena Castro lcastro98@gmail.com
 * @author Adryan Ynfante adryanynfante@gmail.com
 * @since 1.0.0
 */
public class ControllerGamer implements ICreate {
    GamerRepository gamerRepo = new GamerRepository();

    /**
     * Insert a gamer into the repository
     *
     * @param o an instance of the gamer object
     * @return gamer
     */
    @Override
    public Gamer create(Object o) {
        gamerRepo.insertGamer(new Gamer(0, o.toString()));
        Gamer gamer = gamerRepo.getLastGamer();
        return gamer;
    }

}
