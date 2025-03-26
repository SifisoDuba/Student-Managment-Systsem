package org.example;

import org.example.Entity.Classroom;
import org.example.Factory.ClassroomFactory;


public class Main {
    public static void main(String[] args) {
        Classroom classroom =  ClassroomFactory.createClassroom("A124","155",35,
                                                                true,"Engineering");
        Classroom classroom2 =  ClassroomFactory.createClassroom("A246","150","Engineering");

        System.out.println(classroom);
        System.out.println(classroom2);

        }
    }
