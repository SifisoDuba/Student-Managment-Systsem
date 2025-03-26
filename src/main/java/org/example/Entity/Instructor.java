package org.example.Entity;

public class Instructor {
    private String instructorId;
    private String instructorName;
    private String instructorSurname;
    private String instructorAddress;
    private String specialization;
    private String assignedCourse;

    public Instructor(String instructorId, String instructorName,String instructorSurname, String instructorAddress,
                      String specialization, String assignedCourse) {
        this.instructorId = instructorId;
        this.instructorName = instructorName;
        this.instructorSurname = instructorSurname;
        this.instructorAddress = instructorAddress;
        this.specialization = specialization;
        this.assignedCourse = assignedCourse;

    }
    public String getInstructorId() {
        return instructorId;
    }
    public String getInstructorName() {
        return instructorName;
    }
    public String getInstructorSurname() {
        return instructorSurname;
    }
    public String getInstructorAddress() {
        return instructorAddress;
    }
    public String getSpecialization() {
        return specialization;
    }
    public String getAssignedCourse() {
        return assignedCourse;
    }
    public void setAssignedCourse(String assignedCourse) {
        this.assignedCourse = assignedCourse;
    }
    public void setInstructorId(String instructorId) {
        this.instructorId = instructorId;
    }
    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }
    public void setInstructorSurname(String instructorSurname) {
        this.instructorSurname = instructorSurname;
    }
    public void setInstructorAddress(String instructorAddress) {
        this.instructorAddress = instructorAddress;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }


    public String toString() {
        return "Instructor Details:"+" "+"\nInstructor Id: " + instructorId + "\nInstructor Name: " + instructorName
                +"\nInstructor Surname: "+ instructorSurname + "\nInstructor Address: " + instructorAddress +
                "\nSpecialization: " + specialization + "\nAssigned Course: " + assignedCourse;
    }

    public static class Builder{

        private String instructorId;
        private String instructorName;
        private String instructorSurname;
        private String instructorAddress;
        private String specialization;
        private String assignedCourse;

        public Builder(){

        }
        public Builder setInstructorId(String instructorId) {
            this.instructorId = instructorId;
            return this;
        }
        public Builder setInstructorName(String instructorName) {
            this.instructorName = instructorName;
            return this;
        }
        public Builder setInstructorSurname(String instructorSurname) {
            this.instructorSurname = instructorSurname;
            return this;
        }
        public Builder setInstructorAddress(String instructorAddress) {
            this.instructorAddress = instructorAddress;
            return this;
        }
        public Builder setSpecialization(String specialization) {
            this.specialization = specialization;
            return this;
        }
        public Builder setAssignedCourse(String assignedCourse) {
            this.assignedCourse = assignedCourse;
            return this;
        }

        public Instructor build(){
            return new Instructor(instructorId, instructorName,instructorSurname, instructorAddress, specialization,
                    assignedCourse);
        }
    }

}
