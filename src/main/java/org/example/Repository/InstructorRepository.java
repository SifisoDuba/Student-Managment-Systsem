package org.example.Repository;

import org.example.Entity.Instructor;
import java.util.*;

public class InstructorRepository implements IInstructorRepository {
    private final Set<Instructor> instructorSet = new HashSet<>();

    @Override
    public Instructor create(Instructor instructor) {
        instructorSet.add(instructor);
        return instructor;
    }

    @Override
    public Instructor read(String instructorId) {
        return instructorSet.stream()
                .filter(instructor -> instructor.getInstructorId().equals(instructorId))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Instructor update(Instructor updatedInstructor) {
        Instructor existingInstructor = read(updatedInstructor.getInstructorId());
        if (existingInstructor != null) {
            instructorSet.remove(existingInstructor);
            instructorSet.add(updatedInstructor);
            return updatedInstructor;
        }
        return null;
    }

    @Override
    public boolean delete(String instructorId) {
        return instructorSet.removeIf(instructor -> instructor.getInstructorId().equals(instructorId));
    }

    @Override
    public List<Instructor> getAll() {
        return new ArrayList<>(instructorSet);
    }
}
