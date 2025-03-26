package org.example.Factory;

import org.example.Entity.Instructor;

import static org.junit.jupiter.api.Assertions.*;
class InstructorFactoryTest {

    @org.junit.jupiter.api.Test
    void createFullInstructor() {
        Instructor instructor = InstructorFactory.createFullInstructor("#234560",
                "Sifiso","Duba","dubas@mycput.ac.za" +
                        ".za"
                ,"Software Engineering",
                "Application Development");
        System.out.println(instructor);
    }

    @org.junit.jupiter.api.Test
    void createInstructorDetails() {
        Instructor instructor = InstructorFactory.createInstructorDetails("#234560",
                "Sifiso","Duba","dubas@mycput.ac.za");
        System.out.println(instructor);
    }

    @org.junit.jupiter.api.Test
    void creatyeInstructorCareer() {
        Instructor instructor = InstructorFactory.creatyeInstructorCareer("Software Engineering",
                "Application Development");
        System.out.println(instructor);
    }

}