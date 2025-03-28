package org.example.Repository;

import org.example.Entity.Instructor;
import java.util.*;

public class InstructorRepository implements IInstructorRepository {
    private final Set<Instructor> instructorSet = new HashSet<>();

    public Instructor createInstructor(Instructor instructor) {
        instructorSet.add(instructor);
        return instructor;
    }
    public Instructor findInstructorById(String instructorId) {
        return instructorSet.stream()
                .filter(instructor -> instructor.getInstructorId().equals(instructorId))
                .findFirst()
                .orElse(null);

    }

    public boolean deleteInstructor(String instructorId) {
        return instructorSet.removeIf(course -> course.getInstructorId().equals(instructorId));
    }

    public Set<Instructor> getAllInstructors() {
        return new HashSet<>(instructorSet);
    }

    @Override
    public List<Instructor> getAll() {
        return List.of();
    }

    @Override
    public Instructor create(Instructor instructor) {
        return null;
    }

    @Override
    public Instructor read(Integer integer) {
        return null;
    }

    @Override
    public Instructor update(Instructor instructor) {
        return null;
    }

    @Override
    public boolean delete(Integer integer) {
        return false;
    }
}
