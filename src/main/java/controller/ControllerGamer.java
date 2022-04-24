package controller;

import domain.Gamer;
import repository.GamerRepository;

public class ControllerGamer implements ICreate {
    GamerRepository gamerRepo = new GamerRepository();

    @Override
    public Gamer create(Object o) {
        gamerRepo.insertGamer(new Gamer(0, o.toString()));
        Gamer gamer = gamerRepo.getLastGamer();
        return gamer;
    }

}
