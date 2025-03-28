package org.example.Repository;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import org.example.Entity.Admin;
import org.example.Factory.AdminFactory;

@TestMethodOrder(MethodOrderer.MethodName.class)
class AdminRepositoryTest {

    private static IAdminRepository repository = AdminRepository.getRepository();
    private Admin admin = AdminFactory.createAdmin("A101", "John Doe", "johndoe@example.com", "SuperAdmin");

    @Test
    void a_create() {
        Admin created = repository.create(admin);
        assertNotNull(created);
        System.out.println(created.toString());
    }

    @Test
    void b_read() {
        Admin read = repository.read(admin.getadminID());
        assertNotNull(read);
        System.out.println(read.toString());
    }

    @Test
    void c_update() {
        Admin updatedAdmin = new Admin.Builder().copy(admin)
                .setadminName("Jane Doe")
                .build();
        Admin updated = repository.update(updatedAdmin);
        assertNotNull(updated);
        System.out.println(updated.toString());
    }

    @Test
    void d_delete() {
        assertTrue(repository.delete(admin.getadminID()));
        System.out.println("Successfully deleted");
    }

    @Test
    void e_getAll() {
        System.out.println(repository.getAll());
    }
}
