package org.example.Factory;

// Author Laeeqah //
// StudentNumber 222671173 //
// Group 3D //

import org.example.Entity.Course;

//overloading constructor//
public class CourseFactory {
    public static Course createCourse(String id, String title, String description, int duration, String instructorId) {
        if (id == null || title == null || description == null || instructorId == null || duration <= 0) {
            throw new IllegalArgumentException("Invalid course details");
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
