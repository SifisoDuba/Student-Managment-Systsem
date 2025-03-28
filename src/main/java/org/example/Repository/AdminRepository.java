package org.example.Repository;

import org.example.Entity.Admin;
import java.util.ArrayList;
import java.util.List;

public class AdminRepository implements IAdminRepository {

    private static IAdminRepository repository = null;
    private final List<Admin> adminList;

    private AdminRepository() {
        this.adminList = new ArrayList<>();
    }

    public static IAdminRepository getRepository() {
        if (repository == null) {
            repository = new AdminRepository();
        }
        return repository;
    }

    @Override
    public Admin create(Admin admin) {
        boolean success = adminList.add(admin);
        return success ? admin : null;
    }

    @Override
    public Admin read(String id) {
        for (Admin admin : adminList) {
            if (admin.getadminID().equals(id)) {
                return admin;
            }
        }
        return null;
    }

    @Override
    public Admin update(Admin admin) {
        String id = admin.getadminID();
        Admin existingAdmin = read(id);
        if (existingAdmin != null) {
            boolean success = delete(id);
            if (success) {
                adminList.add(admin);
                return admin;
            }
        }
        return null;
    }

    @Override
    public boolean delete(String id) {
        Admin admin = read(id);
        return admin != null && adminList.remove(admin);
    }

    @Override
    public List<Admin> getAll() {
        return adminList;
    }
}
