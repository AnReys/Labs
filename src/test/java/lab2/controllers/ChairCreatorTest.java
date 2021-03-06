package lab2.controllers;

import lab2.model.Chair;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ChairCreatorTest {

    @Test
    public void createChairRandomly() {
        ChairCreator creator = new ChairCreator();
        Chair chair = creator.createChairRandomly();
        assertTrue(ChairCreator.MIN_NUMBER_CHAIR_SIZE > 0);
        assertTrue(ChairCreator.MAX_NUMBER_CHAIR_SIZE < 100);
    }
}