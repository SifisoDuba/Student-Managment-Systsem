package org.example;


import org.example.Entity.Instructor;
import org.example.Factory.InstructorFactory;

public class Main {
    public static void main(String[] args) {

        Instructor instructor = InstructorFactory.createFullInstructor("#234560",
                "Sifiso","Duba","dubas@mycput.ac.za" +
                ".za"
                ,"Software Engineering",
                "Application Development");
        System.out.println(instructor);

    }
}