package org.example.Repository;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.example.Entity.Classroom;
import org.example.Factory.ClassroomFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class ClassroomRepositoryTest {
    private static IClassroomRepository repository = ClassroomRepository.getRepository();

    private Classroom classroom = ClassroomFactory.createClassroom("C101", "Room 101", "30", true, "Building A");

    @Test
    void a_create() {
        Classroom created = repository.create(classroom);
        assertNotNull(created);
        System.out.println(created.toString());
    }

    @Test
    void b_read() {
        Classroom read = repository.read(classroom.getClassroomID());
        assertNotNull(read);
        System.out.println(read.toString());
    }

    @Test
    void c_update() {
        Classroom updatedClassroom = new Classroom.Builder().copy(classroom)
                .setClassroomNumber("Room 102")
                .build();
        Classroom updated = repository.update(updatedClassroom);
        assertNotNull(updated);
        System.out.println(updated.toString());
    }

    @Test
    void d_delete() {
        assertTrue(repository.delete(classroom.getClassroomID()));
        System.out.println("Successfully deleted");
    }

    @Test
    void e_getAll() {
        System.out.println(repository.getAll());
    }
}