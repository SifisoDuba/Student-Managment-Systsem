package org.example.Factory;
// Author Itumeleng //
// StudentNumber 222671173 //
// Group 3D //
import org.example.Entity.Student;
import org.example.Util.StudentHelper;

public class StudentFactory{










    //overloading the constuctor//
    public static Student createStudent(String StudentID, String StudentName, String Gender,String Email ) {
        return new Student.Builder()
                .setStudentID(StudentID)
                .setStudentName(StudentName)
                .setGender(Gender)
                .setEmail(Email)
                .build();
    }
}


