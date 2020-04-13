package io.zipcoder.interfaces;

import objects.Person;
import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void testConstructor(){
        Person testPerson = new Person(1,"Evan Haggard");
                Assert.assertEquals(1,testPerson.getId());
    }
    @Test
    public void testSetName(){
        Person testPerson = new Person(1,"Evan Haggard");
        testPerson.setName("High Speed");
        Assert.assertEquals("High Speed", testPerson.getName());
    }

}
