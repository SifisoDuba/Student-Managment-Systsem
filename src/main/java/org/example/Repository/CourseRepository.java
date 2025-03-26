package org.example.Repository;

// Author: Laeeqah Arendse
// Student Number: 230055923
// Group 3D

import org.example.Entity.Course;
import org.example.Entity.Student;

import java.util.ArrayList;
import java.util.List;

public class CourseRepository {
    private List<Course> courseList = new ArrayList<>();


    //Create //
    public Course createCourse(Course course) {
        courseList.add(course);
        return course;
    }
    // Read
    public Course read(String courseID) {
        return courseList.stream()
                .filter(course -> course.getId().equals(courseID))
                .findFirst()
                .orElse(null);
    }

    // Update
    public Course update(Course updatedCourse) {
        Course existingCourse = read(updatedCourse.getId());
        if (existingCourse != null) {
            courseList.remove(existingCourse);
            courseList.add(updatedCourse);
            return updatedCourse;
        }
        return null;
    }

    // Delete
    public boolean delete(String courseID) {
        Course course = read(courseID);
        if (course != null) {
            courseList.remove(course);
            return true;
        }
        return false;
    }

    // Get All
    public List<Course> getAll() {
        return new ArrayList<>(courseList);
    }
}