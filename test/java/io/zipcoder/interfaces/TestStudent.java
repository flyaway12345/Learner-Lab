package io.zipcoder.interfaces;
import objects.Student;
import objects.Person;
import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    @Test
    public void testImplementation(){
        Student testing = new Student(1,"EvanHaggard");
        Boolean newTest = testing instanceof iLearner;
        Assert.assertTrue(newTest);
    }
    @Test
    public void testInheritance(){
        Student testing = new Student(1,"EvanHaggard");
        Boolean newTest = testing instanceof Person;
        Assert.assertTrue(newTest);
    }
    @Test
    public void testLearn(){
        Student testing = new Student(1,"EvanHaggard");
        testing.learn(5);
        Assert.assertEquals(5.0, testing.getTotalStudyTime(),1000.000);
    }

}
