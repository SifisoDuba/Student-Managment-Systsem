package org.example;

// Author: Laeeqah Arendse
// Student Number: 230055923
// Group 3D

import org.example.Entity.Course;
import org.example.Factory.CourseFactory;
import org.example.Repository.CourseRepository;

public class Main {
    public static void main(String[] args) {


        Course aCourse = CourseFactory.createCourse(
                "1234",
                "Application Development",
                "ND: ICT",
                3,
                "I001"
        );

        if (aCourse != null) {
            System.out.println(aCourse);
        }

        CourseRepository repository = new CourseRepository();
        repository.addCourse(aCourse);

        Course fetchedCourse = repository.getCourseById("1234");
        System.out.println("Fetched Course: " + fetchedCourse);
    }
}
