package lab2.controllers;

import lab2.model.Human;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class HumanCreator {
    private static final List<String> dictionaryNames = Arrays.asList("Ann", "Kostya", "Vitaliy", "Dima", "Eva", "Natan", "Pizduck");
    private List<String> dictionarySurnames = Arrays.asList("Faice", "Nikon", "Duck", "Fortune", "Kindza", "Ravi", "Shora");
    private List<String> dictionaryDateOfBirth = Arrays.asList("13/15/1995", "09/08/1992", "02/03/2000", "24/12/1998", "13/06/1955", "31/04/2001", "28/07/1997");

    public Human createHumanRandomly(){
        Random random = new Random();
        Human human = new Human();
        human.setName((dictionaryNames.get(random.nextInt(dictionaryNames.size()-1))));
        human.setSurname((dictionarySurnames.get(random.nextInt(dictionaryNames.size()-1))));
        human.setDateOfBirth((dictionaryDateOfBirth.get(random.nextInt(dictionaryNames.size()-1))));

        return human;

    }
}
