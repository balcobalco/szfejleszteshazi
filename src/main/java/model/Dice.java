package model;
import java.util.Random;

public class Dice {
    public Integer DiceRoll() {
        Random rand = new Random();
        return rand.nextInt(6)+1;
        }
}
