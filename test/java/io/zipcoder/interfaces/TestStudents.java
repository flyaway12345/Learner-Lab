package io.zipcoder.interfaces;

import objects.Person;
import objects.Student;
import objects.Students;
import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void testGetInstance() {
        Students students = Students.getInstance();
        Assert.assertEquals("Billy BadAss",students.getInstance().findById(1L).getName());
        Assert.assertEquals("Queen Of Code",students.getInstance().findById(2L).getName());
        Assert.assertEquals("Foreman Mills",students.getInstance().findById(3L).getName());
        Assert.assertEquals("Game Girl",students.getInstance().findById(4L).getName());
        Assert.assertEquals("Lord Eric", students.getInstance().findById(5L).getName());


    }
}
