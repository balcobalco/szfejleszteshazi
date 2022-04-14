package controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Dice;

public class DiceController {
    public void DiceRoll(ActionEvent actionEvent) {
        Button button = (Button) actionEvent.getSource();
        Dice dice = new Dice();
        dice.DiceRoll();
    }
}
