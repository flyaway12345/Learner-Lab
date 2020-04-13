package io.zipcoder.interfaces;

import objects.Instructors;
import objects.Students;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestInstructors {
    @Test
    public void testGetInstance() {
        Instructors instructors = Instructors.getInstance();
        Assert.assertEquals("Mavrick Mikaila",instructors.getInstance().findById(1L).getName());
        Assert.assertEquals("Chad The Chad",instructors.getInstance().findById(2L).getName());
        Assert.assertEquals("Missy \"Miss High Energy\" Black",instructors.getInstance().findById(3L).getName());
    }
}