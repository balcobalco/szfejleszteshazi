package model;

public class DiceApplication {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/dice.fxml"));
        stage.setTitle("Calculator");
        stage.setResizable(false);
        stage.setScene(new Scene(root));
        stage.show();
    }
}
