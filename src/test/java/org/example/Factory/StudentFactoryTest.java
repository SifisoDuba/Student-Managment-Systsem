package org.example.Factory;

import org.example.Entity.Student;

import static org.junit.jupiter.api.Assertions.*;
class StudentFactoryTest {

    @org.junit.jupiter.api.Test
    void createStudent() {
        Student aStudent = StudentFactory.createStudent(
                "1999",
                "Itu",
                "Male",
                "Itumeleng@Gmail.com"
        );
        assertNotNull(aStudent);
    }
}