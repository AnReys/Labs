package lab2.controllers;

import lab2.model.Chair;
import lab2.model.Faculty;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FacultyCreator {
    public static final int MIN_NUMBER_CHAIR_SIZE = 1;
    public static final int MAX_NUMBER_CHAIR_SIZE = 2;

    public Faculty createFacultyRandomly() {
        Random random = new Random();
        HumanCreator humanCreator = new HumanCreator();
        ChairCreator chairCreator = new ChairCreator();
        int numberOfChairs = random.nextInt(MIN_NUMBER_CHAIR_SIZE) + MAX_NUMBER_CHAIR_SIZE - MIN_NUMBER_CHAIR_SIZE;
        Faculty faculty = new Faculty();
        faculty.setTitle(String.valueOf(random.nextInt()));
        faculty.setManager(humanCreator.createHumanRandomly());
        List<Chair> chairs = new ArrayList<>();

        for (int i = 0; i < numberOfChairs; i++){
            chairs.add(chairCreator.createChairRandomly());
        }
        faculty.setChairs(chairs);
        return faculty;
    }
}