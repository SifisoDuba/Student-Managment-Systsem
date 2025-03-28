package org.example.Repository;

import org.example.Entity.Classroom;

import java.util.ArrayList;
import java.util.List;

public class ClassroomRepository implements IClassroomRepository {

    private static IClassroomRepository repository = null;
    private final List<Classroom> classroomList;

    private ClassroomRepository() {
        this.classroomList = new ArrayList<>();
    }

    public static IClassroomRepository getRepository() {
        if (repository == null) {
            repository = new ClassroomRepository();
        }
        return repository;
    }

    @Override
    public Classroom create(Classroom classroom) {
        boolean success = classroomList.add(classroom);
        return success ? classroom : null;
    }

    @Override
    public Classroom read(String id) {
        for (Classroom classroom : classroomList) {
            if (classroom.getClassroomID().equals(id)) {
                return classroom;
            }
        }
        return null;
    }

    @Override
    public Classroom update(Classroom classroom) {
        String id = classroom.getClassroomID();
        Classroom existingClassroom = read(id);
        if (existingClassroom != null) {
            boolean success = delete(id);
            if (success) {
                classroomList.add(classroom);
                return classroom;
            }
        }
        return null;
    }

    @Override
    public boolean delete(String id) {
        Classroom classroom = read(id);
        return classroom != null && classroomList.remove(classroom);
    }

    @Override
    public List<Classroom> getAll() {
        return classroomList;
    }
}
