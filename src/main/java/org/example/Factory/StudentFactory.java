package org.example.Factory;
// Author Itumeleng //
// StudentNumber 222671173 //
// Group 3D //
import org.example.Entity.Student;
import org.example.Util.Helper;

import javax.swing.*;

public class StudentFactory{




    //overloading the constuctor//
    public static Student createStudent(String StudentID, String StudentName, String Gender,String Email ) {

        if (Helper.isNullOrEmpty(StudentID)
                || Helper.isNullOrEmpty(StudentName)
                || Helper.isNullOrEmpty(Gender)
                || Helper.isNullOrEmpty(Email)

        ) {
            return null;
        }

        if(Helper.isValidEmail(Email)) {

        }
        return new Student.Builder()
                .setStudentID(StudentID)
                .setStudentName(StudentName)
                .setGender(Gender)
                .setEmail(Email)
                .build();



    }}



