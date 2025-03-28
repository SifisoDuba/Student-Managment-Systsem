package org.example.Entity;

import java.util.ArrayList;

public class Classroom {
    private String classroomID;
    private String classroomNumber;
    private String capacity;
    private Boolean isLab;
    private String building;
    private ArrayList<Instructor> instructors;

    public Classroom() {


    }

    public Classroom(String classroomID, String classroomNumber, String capacity, Boolean isLab, String building) {
        this.classroomID = classroomID;
        this.classroomNumber = classroomNumber;
        this.capacity = capacity;
        this.isLab = isLab;
        this.building = building;
    }

    public String getClassroomID() {

        return classroomID;
    }

    public String getBuilding() {

        return building;
    }

    public Boolean getLab() {

        return isLab;
    }


    public String getCapacity() {

        return capacity;
    }

    public String getClassroomNumber() {

        return classroomNumber;
    }

    public Classroom copy() {
        return new Classroom(this.classroomID, this.classroomNumber, this.capacity, this.isLab, this.building);
    }


    @Override
    public String toString() {
        return "Classroom{" +
                "classroomID='" + classroomID + '\'' +
                ", classroomNumber='" + classroomNumber + '\'' +
                ", Capacity=" + capacity +
                ", isLab=" + isLab +
                ", building='" + building + '\'' +
                '}';
    }
    public static class Builder{
        private String classroomID;
        private String classroomNumber;
        private String capacity;
        private Boolean isLab;
        private String building;

        public Builder(){

        }
        public Builder(String classroomID, String classroomNumber, String capacity, Boolean isLab, String building) {
            this.classroomID = classroomID;
            this.classroomNumber = classroomNumber;
            this.capacity = capacity;
            this.isLab = isLab;
            this.building = building;
        }

        public Builder copy(Classroom classroom) {
            this.classroomID = classroom.getClassroomID();
            this.classroomNumber = classroom.getClassroomNumber();
            this.capacity = classroom.getCapacity();
            this.isLab = classroom.getLab();
            this.building = classroom.getBuilding();
            return this;
        }

        public Builder setClassroomID(String classroomID) {
            this.classroomID = classroomID;
            return this;
        }


        public Builder setClassroomNumber(String classroomNumber) {
            this.classroomNumber = classroomNumber;
            return this;
        }
        public Builder setCapacity(String capacity) {
            this.capacity = capacity;
            return this;
        }
        public Builder setIsLab(Boolean isLab) {
            this.isLab = isLab;
            return this;
        }
        public Builder setBuilding(String building) {
            this.building = building;
            return this;
        }
        public Classroom build(){

            return new Classroom(classroomID, classroomNumber, capacity, isLab, building);
        }


    }
}
