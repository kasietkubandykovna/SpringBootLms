package service;

import entity.Student;

import java.util.List;

public interface StudentService {
    void saveStudent(Student student);
    List<Student> getStudents();
    Student getStudentById(int id);
    void deleteStudentById(int id);
    void updateStudent(Long id, Student student);
}
