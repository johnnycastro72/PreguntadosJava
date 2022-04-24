package controller;

import domain.Round;
import repository.RoundRepository;

public class ControllerRound {
    RoundRepository roundRepo = new RoundRepository();

    @Override
    public Round obtain(Object o) {
        Round round = roundRepo.getRound((Integer) o);
        return round;
    }
}
