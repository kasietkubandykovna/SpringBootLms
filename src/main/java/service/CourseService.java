package service;

import entity.Course;

import java.util.List;

public interface CourseService {
    void saveCompany ( Course course );
    List<Course> getAllCourses();
    Course getById(int id);
    void deleteCourse(int id);
    void updateCourse(Long id,Course course);
}
