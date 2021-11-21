package lab2.controllers;

import lab2.model.Chair;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChairCreatorTest {

    @Test
    public void createChairRandomly() {
        ChairCreator creator = new ChairCreator();
        Chair chair = creator.createChairRandomly();
        assertTrue(ChairCreator.MIN_NUMBER_CHAIR_SIZE > 0);
    }
}