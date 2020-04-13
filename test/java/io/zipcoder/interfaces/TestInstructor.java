package io.zipcoder.interfaces;

import objects.Instructor;
import objects.Person;
import objects.Student;
import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    @Test
    public void testImplementation(){
        Instructor testing = new Instructor(1,"EvanHaggard");
        Boolean newTest = testing instanceof iTeacher;
        Assert.assertTrue(newTest);
    }
    @Test
    public void testInheritance(){
        Instructor testing = new Instructor(1,"EvanHaggard");
        Boolean newTest = testing instanceof Person;
        Assert.assertTrue(newTest);
    }
    @Test
    public void testTeach(){
        Instructor testing = new Instructor(1,"EvanHaggard");
        Student testing2 = new Student(1,"EvanHaggard");

        testing.teach(testing2,5);
        Assert.assertEquals(5.0, testing2.getTotalStudyTime(),1000.000);
    }
    @Test
    public void testLecture(){
        Instructor testing = new Instructor(1,"EvanHaggard");
        Student testing2 = new Student(1,"EvanHaggard");
        Student testing3 = new Student(2,"HI SPEED");
        Student[] classroom = {testing2,testing3};
        testing.lecture(classroom,6);
        Assert.assertEquals(3.0, testing2.getTotalStudyTime(),1000.000);
    }

}
