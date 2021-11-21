package lab2.controllers;

import lab2.model.Group;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GroupCreatorTest {

    @Test
    public void createGroupRandomly() {
        GroupCreator creator = new GroupCreator();
        Group group = creator.createGroupRandomly();
        assertTrue(GroupCreator.MIN_NUMBER_GROUP_SIZE > 0);
    }
}