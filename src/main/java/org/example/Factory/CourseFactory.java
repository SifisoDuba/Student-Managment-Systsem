package org.example.Factory;

// Author: Laeeqah Arendse
// Student Number: 230055923
// Group 3D

import org.example.Entity.Course;
import org.example.Util.Helper;

import java.time.Duration;

public class CourseFactory {
    public static Course createCourse(String id, String title, String description, int duration, String instructorId) {
        if (Helper.isNullOrEmpty(id) ||
                Helper.isNullOrEmpty(title) ||
                Helper.isNullOrEmpty(description) ||
                Helper.isNullOrEmpty(instructorId)) {
            return null;
        }
        return new Course.Builder()
                .setId(id)
                .setTitle(title)
                .setDescription(description)
                .setDuration(duration)
                .setInstructorId(instructorId)
                .build();
    }
}