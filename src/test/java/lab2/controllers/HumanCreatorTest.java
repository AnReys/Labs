package lab2.controllers;

import lab2.model.Human;
import org.junit.Test;
import static org.junit.Assert.*;

public class HumanCreatorTest {

    @Test
    public void createHumanRandomly() {
        HumanCreator creator = new HumanCreator();
        Human human = creator.createHumanRandomly();
        assertTrue(HumanCreator.DICTIONARY_NAMES.contains(human.getName()));
        assertTrue(HumanCreator.DICTIONARY_SURNAMES.contains(human.getSurname()));
        assertTrue(HumanCreator.DICTIONARY_DATE_OF_BIRTH.contains(human.getDateOfBirth()));
    }
}