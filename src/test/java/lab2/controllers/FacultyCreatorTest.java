package lab2.controllers;

import lab2.model.Faculty;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertTrue;

public class FacultyCreatorTest {

    @Test
    public void createFacultyRandomly() {
        FacultyCreator creator = new FacultyCreator();
        Faculty faculty = creator.createFacultyRandomly();
        assertTrue(FacultyCreator.MIN_NUMBER_FACULTY_SIZE > 0);
        assertTrue(FacultyCreator.MAX_NUMBER_FACULTY_SIZE < 100);
    }
}