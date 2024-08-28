package service;

import entity.Lesson;

import java.util.List;

public interface LessonService {
    void saveLesson(Lesson lesson);
    List<Lesson> getAllLessons();
    Lesson getLessonByID(int id);
    void deleteLesson(int id);
    void updateLesson(Long id, Lesson lesson);
}
