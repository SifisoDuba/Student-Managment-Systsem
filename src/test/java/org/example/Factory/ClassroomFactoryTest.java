package org.example.Factory;

import org.example.Entity.Classroom;

import static org.junit.jupiter.api.Assertions.*;

class ClassroomFactoryTest {

    @org.junit.jupiter.api.Test
    void createClassroom() {
        Classroom classroom =  ClassroomFactory.createClassroom("A124","155","35", true,"Engineering");
        assertNotNull(classroom);
    }

    @org.junit.jupiter.api.Test
    void testCreateClassroom() {
        Classroom classroom2 =  ClassroomFactory.createClassroom("A246","150","Engineering");
        assertNotNull(classroom2);
    }
}