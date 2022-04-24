package controller;

import domain.Answer;
import domain.Gamer;
import domain.Record;
import domain.Round;
import domain.Prize;
import domain.Question;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ControllerGame {

    private String optionMenu(Integer typeMenu) {
        Scanner scan = new Scanner(System.in);
        String mainMenu =  """                    

                    ************************************************************************************
                                              Bienvenido al concurso Preguntados
                                               
                    Por favor seleccione una de las siguientes opciones:
                    1 Jugar
                    2 Ver Resultados
                    3 Salir
                    ************************************************************************************""";
        String continueMenu = """

                    ************************************************************************************
                    ¡Haz contestado correctamente!
                    Por favor seleccione una de las siguientes opciones:
                    1 Continuar
                    2 Rendirse
                    ************************************************************************************""";
        System.out.println((typeMenu==1) ? mainMenu: continueMenu);
        String ansMenu = scan.next();
        return ansMenu;
    }

    private Gamer gamerName() {
        ControllerGamer controllerGamer = new ControllerGamer();
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor ingrese su nombre: ");
        String name = scan.next();
        Gamer gamer = controllerGamer.create(name);
        return gamer;
    }

    private void saveRecord(Integer id, Gamer gamer, Timestamp date, Float value, String message) {
        ControllerRecord controllerRecord = new ControllerRecord();
        Record record = new Record(id, gamer, date, value);
        controllerRecord.create(record);
        System.out.println(message);
        System.out.println("Tu premio acumulado es: " + value);
    }

    private void showScores() {
        ControllerRecord controllerRecord = new ControllerRecord();
        ArrayList<Record> records = controllerRecord.query();
        System.out.println("************************************************************************************");
        System.out.println("* Id *              Nombre del Jugador                     *       Premio          *");
        System.out.println("************************************************************************************");
        for (Record record : records) {
            System.out.format("* %2s * %-51s * %22s*%n", record.Id().toString(), record.gamer().name(), record.value().toString());
        }
        System.out.println("************************************************************************************");
    }

    private Object[] obtainRound(Integer actualRound, Float value) {
        Scanner scan = new Scanner(System.in);
        ControllerRound controllerRound = new ControllerRound();
        ControllerQuestion controllerQuestion = new ControllerQuestion();
        ControllerAnswer controllerAnswer = new ControllerAnswer();
        Round round = controllerRound.obtain(actualRound);
        Prize prize = round.prize();
        System.out.println("Tu premio acumulado es: " + value);
        System.out.println("Contesta la pregunta correctamente y podrás ganar " + prize);
        ArrayList<Question> questions = controllerQuestion.query(round.category());
        Random random = new Random();
        Question question = questions.get(random.nextInt((4 - 1) + 1) + 1);
        System.out.println("************************************************************************************");
        System.out.println(question.text());
        ArrayList<Answer> answers = controllerAnswer.query(question);
        for (Integer i = 1; i < answers.size() + 1; i++) {
            System.out.println(i.toString() + " - " + answers.get(i - 1).text());
        }
        System.out.println("Elija la respuesta correcta: ");
        System.out.println("************************************************************************************");
        String ansGamer = scan.next();
        Integer intAnswer = Integer.parseInt(ansGamer);
        value += prize.value();
        return new Object[]{Boolean.valueOf((answers.get(intAnswer - 1).correct())),Float.valueOf(value)};
    }

    private void startRounds() {
        Timestamp date;
        String continueMenu;
        date = new Timestamp(System.currentTimeMillis());
        Gamer gamer = gamerName();
        Integer actualRound = 1;
        Float value = 0f;

        do {
            Object arrayAns[] = obtainRound(actualRound, value);
            Boolean ansCorrect = (Boolean) arrayAns[0];
            value = (Float) arrayAns[1];
            actualRound++;
            if (ansCorrect && (actualRound < 6)) {
                continueMenu = optionMenu(2);
                if (continueMenu.equals("2")) {
                    saveRecord(0, gamer, date, value, "Ohh vale " + gamer + ", también se vale rendirse");
                }

            } else {
                if (actualRound == 6) {
                    saveRecord(0, gamer, date, value, "Excelente!!! " + gamer + ", has ganado el juego");
                    break;
                }
                value = 0F;
                saveRecord(0, gamer, date, value, "Ops! Lo sentimos " + gamer + ", has perdido todo");
                break;
            }
        } while (continueMenu.equals("1"));
    }

    public void GameStart() {
        String mainMenu;
        do {
            mainMenu = optionMenu(1);
            switch (mainMenu) {
                case "1" -> {
                    startRounds();
                }
                case "2" -> {
                    showScores();
                }
            }
        }
        while (!mainMenu.equals("3"));
    }

}
