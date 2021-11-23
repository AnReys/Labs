package lab2.controllers;

import lab2.model.University;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class UniversityCreatorTest {

    @Test
    public void createUniversityRandomly() {
        UniversityCreator creator = new UniversityCreator();
        University university = creator.createUniversityRandomly();
        assertTrue(UniversityCreator.MIN_NUMBER_UNIVERSITY_SIZE > 0);
        assertTrue(UniversityCreator.MAX_NUMBER_UNIVERSITY_SIZE < 100);
    }
}