package org.example.Factory;

// Author: Laeeqah Arendse
// Student Number: 230055923
// Group 3D

import org.example.Entity.Course;

public class CourseFactory {
    public static Course createCourse(String id, String title, String description, int duration, String instructorId) {
        return new Course.Builder()
                .setId(id)
                .setTitle(title)
                .setDescription(description)
                .setDuration(duration)
                .setInstructorId(instructorId)
                .build();
    }
}