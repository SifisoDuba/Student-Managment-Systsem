package org.example.Repository;
import org.example.Entity.Student;

import java.util.List;


    public interface IStudentRepository extends IRepository<Student, String> {
        List<Student> getAll();
    }


