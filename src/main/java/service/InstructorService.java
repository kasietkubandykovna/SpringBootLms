package service;

import entity.Instructor;

import java.util.List;

public interface InstructorService {
    void saveInstructor(Instructor instructor);
    List<Instructor> getAllInstructors();
    Instructor getInstructorById(int id);
    void deleteInstructorById(int id);
    void updateInstructor(Long id,Instructor instructor);
}
