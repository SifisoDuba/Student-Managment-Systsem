package org.example.Factory;

import org.example.Entity.Admin;

import static org.junit.jupiter.api.Assertions.*;
class AdminFactoryTest {

    @org.junit.jupiter.api.Test
    void createAdmin() {

        Admin anAdmin = AdminFactory.createAdmin("22222","Faith","faithA@gmail.com","Project Manager");
        assertNotNull(anAdmin);


    }
}