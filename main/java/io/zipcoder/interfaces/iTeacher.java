package io.zipcoder.interfaces;

public interface iTeacher {
    void teach(iLearner learner,double numberOfHours);
    void lecture(iLearner[] learners, double numberOfHours);
}
