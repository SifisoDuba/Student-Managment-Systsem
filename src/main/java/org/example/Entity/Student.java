package org.example.Entity;
// Author Itumeleng //
// StudentNumber 222671173 //
// Group 3D //

import org.example.Factory.StudentFactory;

import java.util.Date;

public class Student {
    private String StudentID;
    private String StudentName;
    private String StudentSurname;
    private Date DateOfBirth;
    private String Gender;
    private String Email;
    private String PhoneNumber;
    private String Address;
    private String GuadianDetails;


    private Student(){

    }

    private Student(String studentID, String studentName, String studentSurname, Date dateOfBirth, String gender, String email, String phoneNumber, String address, String guadianDetails) {

        this.StudentID = studentID;
        this.StudentName = studentName;
        this.StudentSurname = studentSurname;
        this.DateOfBirth = dateOfBirth;
        this.Gender = gender;
        this.Email = email;
        this.PhoneNumber = phoneNumber;
        this.Address = address;
        this.GuadianDetails = guadianDetails;



    }
    public String getStudentID() {
        return StudentID;
    }

    public String getStudentName() {
        return StudentName;
    }

    public String getStudentSurname() {
        return StudentSurname;
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    public String getGender() {
        return Gender;
    }

    public String getEmail() {
        return Email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public String getAddress() {
        return Address;
    }

    public String getGuadianDetails() {
        return GuadianDetails;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentID='" + StudentID + '\'' +
                ", StudentName='" + StudentName + '\'' +
                ", StudentSurname='" + StudentSurname + '\'' +
                ", DateOfBirth=" + DateOfBirth +
                ", Gender='" + Gender + '\'' +
                ", Email='" + Email + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", Address='" + Address + '\'' +
                ", GuadianDetails='" + GuadianDetails + '\'' +
                '}';
    }
    //Inner class builder//
    public static class Builder {
        private String StudentID;
        private String StudentName;
        private String StudentSurname;
        private Date DateOfBirth;
        private String Gender;
        private String Email;
        private String PhoneNumber;
        private String Address;
        private String GuadianDetails;

        public Builder setStudentID(String StudentID) {
            this.StudentID = StudentID;
            return this;
        }
        public Builder setStudentName(String StudentName) {
            this.StudentName = StudentName;
            return this;
        }
        public Builder setStudentSurname(String StudentSurname) {
            this.StudentSurname = StudentSurname;
            return this;
        }
        public Builder setDateOfBirth(Date DateOfBirth) {
            this.DateOfBirth = DateOfBirth;
            return this;
        }
        public Builder setGender(String Gender) {
            this.Gender = Gender;
            return this;
        }
        public Builder setEmail(String Email) {
            this.Email = Email;
            return this;
        }
        public Builder setPhoneNumber(String PhoneNumber) {
            this.PhoneNumber = PhoneNumber;
            return this;
        }
        public Builder setAddress(String Address) {
            this.Address = Address;
            return this;
        }
        public Builder setGuadianDetails(String GuadianDetails) {
            this.GuadianDetails = GuadianDetails;
            return this;
        }
        public Student build() {
            return new Student (
                    this.StudentID,
                    this.StudentName,
                    this.StudentSurname,
                    this.DateOfBirth,
                    this.Gender,
                    this.Email,
                    this.PhoneNumber,
                    this.Address,
                    this.GuadianDetails
            );


        }
    }
}//End main//
