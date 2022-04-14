import javafx.application.Application;
import model.Dice;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Application.launch(DiceApplication.class, args);
        Dice dice = new Dice();
        System.out.println(dice.DiceRoll());
    }
}
