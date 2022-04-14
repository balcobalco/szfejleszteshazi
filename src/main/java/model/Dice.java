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

    public Integer DiceRoll() throws IOException {
        Random rand = new Random();
        Integer szam = rand.nextInt(6)+1;

        var mentettdobas = new MentettDobás();

        System.out.println(mentettdobas.getAtlag());

        var objectMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        FileReader reader = null;

        objectMapper.readValue(new FileReader("tarolt.json"), MentettDobás.class);
        System.out.println(mentettdobas.getDobasokszama());


        reader = new FileReader("tarolt.json");

//        objectMapper.readValue(reader, mentettdobas);
        mentettdobas.setDobasokszama(mentettdobas.getDobasokszama()+1);
        System.out.println("Dobások száma: "+mentettdobas.getDobasokszama());

        var writer = new FileWriter("tarolt.json");
          objectMapper.writeValue(writer, mentettdobas);

        return szam;
        }

}
