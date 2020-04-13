package io.zipcoder.interfaces;

import objects.People;
import objects.Person;
import org.junit.Assert;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

class TestPeople {

    @Test
    void add() {
        List<Person> personList = new ArrayList<>();
        Person expected = new Person(1,"Evan");
       personList.add(expected);

        Assert.assertTrue(personList.contains(expected));
    }

    @Test
    void findById() {
        List<Person> personList = new ArrayList<>();
        Person expected = new Person(1,"Evan");
        Person expected2 = new Person(2,"Bill");

        People peopleTest = new People();
        Person expected3 = new Person(3,"Day");
        personList.add(expected);
        personList.add(expected2);
        peopleTest.add(expected3);
        Person search = peopleTest.findById(3);

        boolean testing = false;
        Assert.assertEquals(expected3,search);

    }

    @Test
    void removeObject() {
        List<Person> personList = new ArrayList<>();
        Person expected = new Person(1,"Evan");
        personList.add(expected);
        personList.remove(expected);


        Assert.assertFalse(personList.contains(expected));
    }
}