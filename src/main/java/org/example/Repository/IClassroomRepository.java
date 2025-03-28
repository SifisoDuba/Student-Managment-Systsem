package org.example.Repository;


import org.example.Entity.Classroom;

import java.util.List;

public interface IClassroomRepository extends IRepository<Classroom, String> {
    List<Classroom> getAll();
}
