package org.example.Factory;

import org.example.Entity.Instructor;
import org.example.Util.Helper;

import java.util.UUID;

public class InstructorFactory {

   // private static final InstructorRepository repo = new InstructorRepository();

    public static Instructor createFullInstructor(String instructorId,String instructorName,
                                              String instructorSurname, String instructorAddress,
                                              String specialization, String assignedCourse) {
            String InstructorId = UUID.randomUUID().toString();
        if (Helper.isNullOrEmpty(instructorId) ||
                Helper.isNullOrEmpty(instructorName) ||
                Helper.isNullOrEmpty(instructorSurname) ||
                Helper.isNullOrEmpty(instructorAddress) ||
                Helper.isNullOrEmpty(specialization) ||
                Helper.isNullOrEmpty(assignedCourse)) {
            return null;
        }

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
                String InstructorId = UUID.randomUUID().toString();

        if (Helper.isNullOrEmpty(instructorId) ||
                Helper.isNullOrEmpty(instructorName) ||
                Helper.isNullOrEmpty(instructorSurname) ||
                Helper.isNullOrEmpty(instructorAddress)) {
            return null;
        }
        return new Instructor.Builder()

                .setInstructorId(instructorId)
                .setInstructorId(instructorId)
                .setInstructorName(instructorName)
                .setInstructorSurname(instructorSurname)
                .setInstructorAddress(instructorAddress)
                .build();

    }

    public static Instructor createInstructorCareer(String specialization,String assignedCourse) {

        if (    Helper.isNullOrEmpty(specialization) ||
                Helper.isNullOrEmpty(assignedCourse)) {
            return null;
        }

        return new Instructor.Builder()
                .setSpecialization(specialization)
                .setAssignedCourse(assignedCourse)
                .build();
    }


}
