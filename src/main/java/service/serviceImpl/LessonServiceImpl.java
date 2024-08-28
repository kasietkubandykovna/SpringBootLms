package service.serviceImpl;

import entity.Lesson;
import service.LessonService;

import java.util.List;

public class LessonServiceImpl implements LessonService {
    @Override
    public void saveLesson(Lesson lesson) {

    }

    @Override
    public List<Lesson> getAllLessons() {
        return List.of();
    }

    @Override
    public Lesson getLessonByID(int id) {
        return null;
    }

    @Override
    public void deleteLesson(int id) {

    }

    @Override
    public void updateLesson(Long id, Lesson lesson) {

    }
}
