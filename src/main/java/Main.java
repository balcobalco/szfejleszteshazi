import java.io.FileReader;
import java.io.FileWriter;
import javafx.application.Application;
import model.Dice;
import model.MentettDobás;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        var objectMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        System.out.println(objectMapper.readValue(new FileReader("tarolt.json"), MentettDobás.class));

        MentettDobás mentettDobás = new MentettDobás();
        mentettDobás = objectMapper.readValue(new FileReader("tarolt.json"), MentettDobás.class);
        System.out.println(mentettDobás.getAtlag());
        double atlag = mentettDobás.getAtlag();
        Integer dobasokszama = mentettDobás.getDobasokszama();

        Application.launch(DiceApplication.class, args);
    }
}