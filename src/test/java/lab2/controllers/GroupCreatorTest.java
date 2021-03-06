package lab2.controllers;

import lab2.model.Group;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GroupCreatorTest {

    @Test
    public void createGroupRandomly() {
        GroupCreator creator = new GroupCreator();
        Group group = creator.createGroupRandomly();
        assertTrue(GroupCreator.MIN_NUMBER_GROUP_SIZE > 0);
        assertTrue(GroupCreator.MAX_NUMBER_GROUP_SIZE < 100);
    }
}