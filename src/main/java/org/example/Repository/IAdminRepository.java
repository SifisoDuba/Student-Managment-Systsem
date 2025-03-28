package org.example.Repository;

import org.example.Entity.Admin;
import java.util.List;

public interface IAdminRepository extends IRepository<Admin, String> {
    List<Admin> getAll();
}
