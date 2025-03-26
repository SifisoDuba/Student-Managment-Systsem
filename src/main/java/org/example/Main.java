package org.example;



import org.example.Entity.Instructor;
import org.example.Factory.InstructorFactory;
import org.example.Entity.Classroom;
import org.example.Factory.ClassroomFactory;

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

        System.out.println(classroom);
        System.out.println(classroom2);

        }

    }
