package org.example;

import org.example.Entity.Student;
import org.example.Factory.StudentFactory;


public class Main {
    public static void main(String[] args) {

        Student aStudent = StudentFactory.createStudent(
                "1999",
                "Itu",
                "Male",
                "Itumeleng@Gmail.com"
        );
        if (aStudent != null) {
            System.out.println(aStudent);
        }

    }

}

