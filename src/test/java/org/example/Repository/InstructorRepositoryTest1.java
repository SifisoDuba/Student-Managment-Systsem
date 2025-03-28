package org.example.Repository;

import org.example.Entity.Instructor;
import org.example.Factory.InstructorFactory;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class InstructorRepositoryTest {

    private static IInstructorRepository repository = new InstructorRepository();

    private static Instructor instructor = InstructorFactory.createFullInstructor(
            "I001",
            "John",
            "Doe",
            "123 Main St",
            "Mathematics",
            "MATH101"
    );

    @Test
    void a_create() {
        Instructor created = repository.create(instructor);
        assertNotNull(created);
        assertEquals(instructor.getInstructorId(), created.getInstructorId());
        System.out.println("Created: " + created);
    }

    @Test
    void b_read() {
        Instructor read = repository.read(instructor.getInstructorId());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        Instructor updatedInstructor = new Instructor.Builder()
                .copy(instructor)
                .setInstructorName("Jane")
                .setInstructorSurname("Smith")
                .build();
        Instructor updated = repository.update(updatedInstructor);
        assertNotNull(updated);
        assertEquals("Jane", updated.getInstructorName());
        System.out.println("Updated: " + updated);
    }

    @Test
    void d_delete() {
        boolean success = repository.delete(instructor.getInstructorId());
        assertTrue(success);
        System.out.println("Deleted: " + success);
    }

    @Test
    void e_getAll() {
        System.out.println("All Instructors: " + repository.getAll());
    }
}
