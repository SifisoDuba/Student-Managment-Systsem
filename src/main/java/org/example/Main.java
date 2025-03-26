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
      
      //Bennet main class code

        Instructor instructor = InstructorFactory.createFullInstructor("#234560",
                "Sifiso","Duba","dubas@mycput.ac.za" +
                ".za"
                ,"Software Engineering",
                "Application Development");
        System.out.println(instructor);


        //Sifiso main class code
      
        Classroom classroom =  ClassroomFactory.createClassroom("A124","155",35,
                                                                true,"Engineering");
        Classroom classroom2 =  ClassroomFactory.createClassroom("A246","150","Engineering");
  
      
       //Laeeqah main class code

        Course aCourse = CourseFactory.createCourse(
                "1234",
                "Application Development",
                "ND: ICT",
                3,
                "I001"
        );

        if (aCourse != null) {
            System.out.println(aCourse);
        }

        CourseRepository repository = new CourseRepository();
        repository.addCourse(aCourse);

        Course fetchedCourse = repository.getCourseById("1234");
        System.out.println("Fetched Course: " + fetchedCourse);
      
      
        //Itumeleng main class Code 
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
