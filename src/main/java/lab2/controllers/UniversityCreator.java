package lab2.controllers;

import lab2.model.Faculty;
import lab2.model.University;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UniversityCreator {
    public static final int MIN_NUMBER_UNIVERSITY_SIZE = 1;
    public static final int MAX_NUMBER_UNIVERSITY_SIZE = 2;

    public University createUniversityRandomly() {
        Random random = new Random();
        HumanCreator humanCreator = new HumanCreator();
        FacultyCreator facultyCreator = new FacultyCreator();
        int numberOfFaculties = random.nextInt(MIN_NUMBER_UNIVERSITY_SIZE) + MAX_NUMBER_UNIVERSITY_SIZE - MIN_NUMBER_UNIVERSITY_SIZE;
        University university = new University();
        university.setTitle(String.valueOf(random.nextInt()));
        university.setManager(humanCreator.createHumanRandomly());
        List<Faculty> faculties = new ArrayList<>();

        for (int i = 0; i < numberOfFaculties; i++) {
            faculties.add(facultyCreator.createFacultyRandomly());
        }
        university.setFacuties(faculties);
        return university;
    }
}
