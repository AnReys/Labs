package lab2.controllers;

import lab2.model.Human;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class HumanCreator {
    public static final List<String> DICTIONARY_NAMES = Arrays.asList("Ann", "Kostya", "Vitaliy", "Dima", "Eva", "Natan", "Pizduck");
    public static final List<String> DICTIONARY_SURNAMES = Arrays.asList("Faice", "Nikon", "Duck", "Fortune", "Kindza", "Ravi", "Shora");
    public static final List<String> DICTIONARY_DATE_OF_BIRTH = Arrays.asList("13/15/1995", "09/08/1992", "02/03/2000", "24/12/1998", "13/06/1955", "31/04/2001", "28/07/1997");

    public Human createHumanRandomly() {
        Random random = new Random();
        Human human = new Human();
        human.setName((DICTIONARY_NAMES.get(random.nextInt(DICTIONARY_NAMES.size() - 1))));
        human.setSurname((DICTIONARY_SURNAMES.get(random.nextInt(DICTIONARY_SURNAMES.size() - 1))));
        human.setDateOfBirth((DICTIONARY_DATE_OF_BIRTH.get(random.nextInt(DICTIONARY_DATE_OF_BIRTH.size() - 1))));

        return human;
    }
}
