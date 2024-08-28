package service.serviceImpl;

import entity.Student;
import service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    @Override
    public void saveStudent(Student student) {

    }

    @Override
    public List<Student> getStudents() {
        return List.of();
    }

    @Override
    public Student getStudentById(int id) {
        return null;
    }

    @Override
    public void deleteStudentById(int id) {

    }

    @Override
    public void updateStudent(Long id, Student student) {

    }
}
