package org.example.Repository;

import org.example.Entity.Instructor;

import java.util.List;

public interface IInstructorRepository extends IRepository<Instructor, Integer> {

        List<Instructor> getAll();


}
