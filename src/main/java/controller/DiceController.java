package controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.Dice;

import java.io.IOException;

public class DiceController {


    Image pic1 = new Image("file:src/main/resources/fxml/1.png");
    Image pic2 = new Image("file:src/main/resources/fxml/2.png");
    Image pic3 = new Image("file:src/main/resources/fxml/3.png");
    Image pic4 = new Image("file:src/main/resources/fxml/4.png");
    Image pic5 = new Image("file:src/main/resources/fxml/5.png");
    Image pic6 = new Image("file:src/main/resources/fxml/6.png");

    @FXML
    private ImageView valami;

    public void DiceRoll(ActionEvent actionEvent) throws IOException {
        Button button = (Button) actionEvent.getSource();
        Dice dice = new Dice();

        int value = dice.DiceRoll();
        System.out.println(value);
        if(value == 1)
            valami.setImage(pic1);
        if(value == 2)
            valami.setImage(pic2);
        if(value == 3)
            valami.setImage(pic3);
        if(value == 4)
            valami.setImage(pic4);
        if(value == 5)
            valami.setImage(pic5);
        if(value == 6)
            valami.setImage(pic6);

    }
}
