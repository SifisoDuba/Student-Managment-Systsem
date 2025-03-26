package org.example.Factory;

import org.example.Entity.Instructor;

import java.util.UUID;

public class InstructorFactory {

    public static Instructor createFullInstructor(String instructorId,String instructorName,
                                              String instructorSurname, String instructorAddress,
                                              String specialization, String assignedCourse) {

//        if(Helper.isNullOrEmpty(instructorId) || Helper.isNullOrEmpty(instructorName)
//                || Helper.isNullOrEmpty(instructorSurname) || Helper.isNullOrEmpty(instructorAddress)
//                || Helper.isNullOrEmpty(specialization) || Helper.isNullOrEmpty(assignedCourse)){
//            return null;
//        }

        return new Instructor.Builder()
                .setInstructorId(instructorId)
                .setInstructorName(instructorName)
                .setInstructorSurname(instructorSurname)
                .setInstructorAddress(instructorAddress)
                .setSpecialization(specialization)
                .setAssignedCourse(assignedCourse)
                .build();

    }

    public static Instructor createInstructorDetails(String instructorId,String instructorName,
                                                     String instructorSurname, String instructorAddress) {
//        if(Helper.isNullOrEmpty(instructorId) || Helper.isNullOrEmpty(instructorName)
//                || Helper.isNullOrEmpty(instructorSurname) || Helper.isNullOrEmpty(instructorAddress)){
//            return null;
//        }
        return new Instructor.Builder()
                //the UUDI.randomUUID().toString() creates a random id for the instructor and converts it to a string
                // but wont use it here
                //.setInstructorId(UUID.randomUUID().toString())
                .setInstructorId(instructorId)
                .setInstructorName(instructorName)
                .setInstructorSurname(instructorSurname)
                .setInstructorAddress(instructorAddress)
                .build();

    }

    public static Instructor creatyeInstructorCareer(String specialization,String assignedCourse) {

//        if(Helper.isNullOrEmpty(specialization) || Helper.isNullOrEmpty(assignedCourse)){
//            return null;
//        }
        return new Instructor.Builder()
                .setSpecialization(specialization)
                .setAssignedCourse(assignedCourse)
                .build();
    }


}
