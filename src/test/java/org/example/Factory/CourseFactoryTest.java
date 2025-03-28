package org.example.Factory;

import org.example.Entity.Course;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseFactoryTest {

    @Test
    void createCourse() {
        Course course = CourseFactory.createCourse("C001","Java Programming",
                "Learn the basics of Java programming.",60,"I001");
        assertNotNull(course);
    }
}