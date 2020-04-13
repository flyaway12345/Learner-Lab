package objects;

import io.zipcoder.interfaces.iLearner;

public class Student extends Person implements iLearner {
    private Double totalStudyTime;

    public Student(long id, String name) {
        super(id, name);
    }
    public Student() {
        super(0, null);
    }

    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }
    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
