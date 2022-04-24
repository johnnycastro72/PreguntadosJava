package console;

import controller.ControllerGame;

/**
 * This class it's the main class that initialize the project
 *
 * @version 1.0.0 24/04/2022
 * @author Jhonny Castro johnny.castro@misena.edu.co
 * @author Lorena Castro lcastro98@gmail.com
 * @author Adryan Ynfante adryanynfante@gmail.com
 * @since 1.0.0
 */
public class Preguntados {

    public static void main(String[] args) {
        ControllerGame controllerGame = new ControllerGame();
        controllerGame.GameStart();
    }
}
