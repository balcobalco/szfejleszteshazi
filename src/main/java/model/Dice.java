package model;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.net.URL;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;


public class Dice {

    public MentettDobás DiceRoll() throws IOException {
        Random rand = new Random();
        Integer szam = rand.nextInt(6)+1;

        var objectMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        MentettDobás mentettDobás = new MentettDobás();
        mentettDobás = objectMapper.readValue(new FileReader("tarolt.json"), MentettDobás.class);

        mentettDobás.setAtlag(((mentettDobás.getAtlag()* mentettDobás.getDobasokszama()) + szam) / (mentettDobás.getDobasokszama()+1) );
        mentettDobás.setDobasokszama(mentettDobás.getDobasokszama()+1);


        System.out.println(objectMapper.writeValueAsString(mentettDobás));
        try (var writer = new FileWriter("tarolt.json")) {
            objectMapper.writeValue(writer, mentettDobás);
        }

        mentettDobás.setAktualis(szam);





        return mentettDobás;
        }

}