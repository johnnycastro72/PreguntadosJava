package controller;

import domain.Round;
import repository.RoundRepository;

/**
 * This class get an instance of a round from the repository
 *
 * @version 1.0.0 24/04/2022
 * @author Jhonny Castro johnny.castro@misena.edu.co
 * @author Lorena Castro lcastro98@gmail.com
 * @author Adryan Ynfante adryanynfante@gmail.com
 * @since 1.0.0
 */
public class ControllerRound implements IObtain {
    RoundRepository roundRepo = new RoundRepository();

    /**
     * Obtain a round from the repository
     *
     * @param o an instance of the round object
     * @return round
     */
    @Override
    public Round obtain(Object o) {
        Round round = roundRepo.getRound((Integer) o);
        return round;
    }
}
