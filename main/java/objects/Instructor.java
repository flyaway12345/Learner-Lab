package objects;

import io.zipcoder.interfaces.iLearner;
import io.zipcoder.interfaces.iTeacher;
import objects.Person;

public class Instructor extends Person implements iTeacher {

    public Instructor(long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(iLearner learner, double numberOfHours) {
    learner.learn(numberOfHours);
    }
    public void lecture(iLearner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for (iLearner nextLearn: learners) {
            nextLearn.learn(numberOfHoursPerLearner);
        }
    }
}
