package org.example.Factory;

import org.example.Entity.Classroom;
import org.example.Util.Helper;

public class ClassroomFactory {

    public static Classroom createClassroom(String classroomID, String classroomNumber, String capacity, Boolean isLab, String building) {
        if (Helper.isNullOrEmpty(classroomID) ||
                Helper.isNullOrEmpty(classroomNumber) ||
                Helper.isNullOrEmpty(capacity) ||
                Helper.isNullOrEmpty(building)) {
            return null;
        }


        return new Classroom.Builder()
                .setClassroomID(classroomID)
                .setClassroomNumber(classroomNumber)
                .setCapacity(capacity)
                .setIsLab(isLab)
                .setBuilding(building)
                .build();
    }

    public static Classroom createClassroom(String classroomID, String classroomNumber, String building) {
        if (Helper.isNullOrEmpty(classroomID) ||
                Helper.isNullOrEmpty(classroomNumber) ||
                Helper.isNullOrEmpty(building)) {
            return null;
        }

        return new Classroom.Builder()
                .setClassroomID(classroomID)
                .setClassroomNumber(classroomNumber)
                .setBuilding(building)
                .build();
    }
}
