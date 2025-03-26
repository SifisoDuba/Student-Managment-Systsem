package org.example.Factory;

import org.example.Entity.Classroom;

public class ClassroomFactory {

    public static Classroom createClassroom(String classroomID, String classroomNumber, int capacity, Boolean isLab, String building) {
        return new Classroom.Builder()
                .setClassroomNumber(classroomNumber)
                .setClassroomID(classroomID)
                .setCapacity(capacity)
                .setIsLab(isLab)
                .setBuilding(building)
                .build();


    }

    public static Classroom createClassroom(String classroomID, String classroomNumber, String building) {
        return new Classroom.Builder()
                .setClassroomNumber(classroomNumber)
                .setClassroomID(classroomID)
                .setBuilding(building)
                .build();


    }

}
