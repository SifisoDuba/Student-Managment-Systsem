package org.example;

import org.example.Entity.Student;
import org.example.Factory.StudentFactory;
import org.example.Entity.Course;
import org.example.Factory.CourseFactory;
import org.example.Repository.CourseRepository;
import org.example.Entity.Instructor;
import org.example.Factory.InstructorFactory;
import org.example.Entity.Classroom;
import org.example.Factory.ClassroomFactory;

//Laeeqah-Arendse---230055923
// Author: Laeeqah Arendse
// Student Number: 230055923
// Group 3D

public class Main {
    public static void main(String[] args) {

       // System.out.println("fatso");


      //Bennet main class code

        Instructor instructor1 = InstructorFactory.createFullInstructor("#2468",
                "Sifiso","Duba","dubas@mycput.ac.za"
                ,"Software Engineering",
                "Application Development");
        Instructor instructor2 = InstructorFactory.createInstructorDetails("#8642",
                "Lwazi","Shozi","lwazi@mycput.ac.za");

       if (instructor1 != null) {
           System.out.println("---------------------------------------------------------");
           System.out.println(instructor1);
           System.out.println("---------------------------------------------------------");
           System.out.println(instructor2);
           System.out.println("---------------------------------------------------------");
       }



    }
}
