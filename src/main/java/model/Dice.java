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

    public Integer DiceRoll() {
        Random rand = new Random();
        Integer szam = rand.nextInt(6)+1;

        var mentettdobas = new MentettDobás();


        var objectMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        FileReader reader = null;
        try {
            reader = new FileReader("tarolt.json");
        } catch (FileNotFoundException e) {
            mentettdobas.setAtlag(0);
            mentettdobas.setDobasokszama(0);
            mentettdobas.setDobas(0);

        }
//        objectMapper.readValue(reader, mentettdobas);



        try (var writer = new FileWriter("tarolt.json")) {
          objectMapper.writeValue(writer, mentettdobas);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return szam;
        }

}
