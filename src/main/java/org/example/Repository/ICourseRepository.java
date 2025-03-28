package org.example.Repository;

// Author: Laeeqah Arendse
// Student Number: 230055923
// Group 3D

import org.example.Entity.Course;
import java.util.List;

public interface ICourseRepository extends IRepository<Course, String> {
    List<Course> getAll();
}
