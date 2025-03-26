package org.example.Repository;
//Author Itumeleng Bedesho //
// StudentNumber 222671173 //
//Group 3D//
import org.example.Entity.Student;
import java .util.ArrayList;
import java.util.List;

public class StudentRepository {
    private List<Student> studentList = new ArrayList<>();

    //Create //
    public Student createStudent(Student student) {
        studentList.add(student);
        return student;
    }
    // Read
    public Student read(String studentID) {
        return studentList.stream()
                .filter(student -> student.getStudentID().equals(studentID))
                .findFirst()
                .orElse(null);
    }

    // Update
    public Student update(Student updatedStudent) {
        Student existingStudent = read(updatedStudent.getStudentID());
        if (existingStudent != null) {
            studentList.remove(existingStudent);
            studentList.add(updatedStudent);
            return updatedStudent;
        }
        return null;
    }

    // Delete
    public boolean delete(String studentID) {
        Student student = read(studentID);
        if (student != null) {
            studentList.remove(student);
            return true;
        }
        return false;
    }

    // Get All
    public List<Student> getAll() {
        return new ArrayList<>(studentList);
    }
} // End of StudentRepository


