package org.example.Repository;

// Author: Laeeqah Arendse
// Student Number: 230055923
// Group 3D

import org.example.Entity.Course;
import java.util.HashSet;
import java.util.Set;

public class CourseRepository {
    private final Set<Course> courseSet = new HashSet<>();

    public void addCourse(Course course) {
        courseSet.add(course);
    }

    public Course getCourseById(String id) {
        return courseSet.stream()
                .filter(course -> course.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public boolean removeCourse(String id) {
        return courseSet.removeIf(course -> course.getId().equals(id));
    }

    public Set<Course> getAllCourses() {
        return new HashSet<>(courseSet);
    }
}
