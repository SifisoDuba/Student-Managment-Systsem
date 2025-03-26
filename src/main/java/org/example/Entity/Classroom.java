package org.example.Entity;

public class Classroom {
    private String classroomID;
    private String classroomNumber;
    private int capacity;
    private Boolean isLab;
    private String building;

    public Classroom() {

    }

    private Classroom(String classroomID, String classroomNumber, int capacity, Boolean isLab, String building) {
        this.classroomID = classroomID;
        this.classroomNumber = classroomNumber;
        this.capacity = capacity;
        this.isLab = isLab;
        this.building = building;
    }

    private String getClassroomID() {

        return classroomID;
    }

    public String getBuilding() {

        return building;
    }

    public Boolean getLab() {

        return isLab;
    }


    public int getCapacity() {

        return capacity;
    }

    public String getClassroomNumber() {

        return classroomNumber;
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
        private int capacity;
        private Boolean isLab;
        private String building;

        public Builder(){

        }
        public Builder(String classroomID, String classroomNumber, int capacity, Boolean isLab, String building) {
            this.classroomID = classroomID;
            this.classroomNumber = classroomNumber;
            this.capacity = capacity;
            this.isLab = isLab;
            this.building = building;
        }
        public Builder setClassroomID(String classroomID) {
            this.classroomID = classroomID;
            return this;
        }
        public Builder setClassroomNumber(String classroomNumber) {
            this.classroomNumber = classroomNumber;
            return this;
        }
        public Builder setCapacity(int capacity) {
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
