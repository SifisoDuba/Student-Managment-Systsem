package org.example.Repository;

import org.example.Entity.Course;
import org.example.Factory.CourseFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseRepositoryTest {

    private static CourseRepository repository;
    private static Course course;

    @BeforeEach
    void setUp() {
        repository = new CourseRepository();
        course = CourseFactory.createCourse("C001", "Math 101", "Basic Mathematics", 12, "I001");
    }

    @Test
    void createCourseTest() {
        Course created = repository.createCourse(course);
        assertNotNull(created);
        assertEquals(course.getId(), created.getId());
        System.out.println("Created: " + created);
    }

    @Test
    void readCourseTest() {
        repository.createCourse(course);
        Course read = repository.read(course.getId());
        assertNotNull(read);
        assertEquals(course.getId(), read.getId());
        System.out.println("Read: " + read);
    }

    @Test
    void updateCourseTest() {
        repository.createCourse(course);
        Course updatedCourse = new Course.Builder()
                .setId(course.getId())
                .setTitle("Math 102")
                .setDescription("Advanced Mathematics")
                .setDuration(14)
                .setInstructorId(course.getInstructorId())
                .build();

        Course updated = repository.update(updatedCourse);
        assertNotNull(updated);
        assertEquals("Math 102", updated.getTitle());
        System.out.println("Updated: " + updated);
    }

    @Test
    void deleteCourseTest() {
        repository.createCourse(course);
        boolean success = repository.delete(course.getId());
        assertTrue(success);
        System.out.println("Deleted: " + success);
    }

    @Test
    void getAllCoursesTest() {
        repository.createCourse(course);
        assertFalse(repository.getAll().isEmpty());
        System.out.println("All Courses: " + repository.getAll());
    }
}
