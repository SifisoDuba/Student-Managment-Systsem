/*package org.example.Repository;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class StudentRepositoryTest {

    @Test
    void createStudent() {
    }

    @Test
    void read() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }

    @Test
    void getAll() {
    }
}*/
package org.example.Repository;

import org.example.Entity.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentRepositoryTest {

    private StudentRepository studentRepository;
    private Student student;

    @BeforeEach
    void setUp() {
        studentRepository = new StudentRepository();
        student = new Student.Builder()
                .setStudentID("S001")
                .setStudentName("John")
                .setStudentSurname("Doe")
                .setDateOfBirth(new Date())
                .setGender("Male")
                .setEmail("john.doe@example.com")
                .setPhoneNumber("1234567890")
                .setAddress("123 Street, City")
                .setGuadianDetails("Parent: Jane Doe")
                .build();
    }

    @Test
    void testCreateStudent() {
        Student createdStudent = studentRepository.createStudent(student);
        assertNotNull(createdStudent);
        assertEquals("S001", createdStudent.getStudentID());
    }

    @Test
    void testReadStudent() {
        studentRepository.createStudent(student);
        Student foundStudent = studentRepository.read("S001");
        assertNotNull(foundStudent);
        assertEquals("John", foundStudent.getStudentName());
    }

    @Test
    void testUpdateStudent() {
        studentRepository.createStudent(student);

        // Creating an updated version of the student
        Student updatedStudent = new Student.Builder()
                .setStudentID("S001")
                .setStudentName("John Updated")
                .setStudentSurname("Doe")
                .setDateOfBirth(new Date())
                .setGender("Male")
                .setEmail("john.updated@example.com")
                .setPhoneNumber("0987654321")
                .setAddress("456 Avenue, City")
                .setGuadianDetails("Parent: Jane Doe")
                .build();

        Student result = studentRepository.update(updatedStudent);
        assertNotNull(result);
        assertEquals("John Updated", result.getStudentName());
        assertEquals("0987654321", result.getPhoneNumber());
    }

    @Test
    void testDeleteStudent() {
        studentRepository.createStudent(student);
        boolean deleted = studentRepository.delete("S001");
        assertTrue(deleted);
        assertNull(studentRepository.read("S001"));
    }

    @Test
    void testGetAllStudents() {
        studentRepository.createStudent(student);
        List<Student> students = studentRepository.getAll();
        assertEquals(1, students.size());
    }
}
