package org.example.Entity;
// Author Laeeqah //
// StudentNumber 230055923 //
// Group 3D //

import org.example.Factory.CourseFactory;

import java.util.Date;

public class Course {
    private final String id;
    private final String title;
    private final String description;
    private final int duration; // Duration in weeks
    private final String instructorId;

    private Course(Builder builder) {
        this.id = builder.id;
        this.title = builder.title;
        this.description = builder.description;
        this.duration = builder.duration;
        this.instructorId = builder.instructorId;
}

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getDuration() {
        return duration;
    }

    public String getInstructorId() {
        return instructorId;
    }

    public static class Builder {
        private String id;
        private String title;
        private String description;
        private int duration;
        private String instructorId;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setDuration(int duration) {
            this.duration = duration;
            return this;
        }

        public Builder setInstructorId(String instructorId) {
            this.instructorId = instructorId;
            return this;
        }

        public Course build() {
            return new Course(this);
        }
    }
}