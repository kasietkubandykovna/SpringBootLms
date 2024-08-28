package service;

import entity.Task;

import java.util.List;

public interface TaskService {
    void saveTask(Task task);
    List<Task> getAllTasks();
    Task getTaskById(int id);
    void deleteTaskById(int id);
    void updateTask(Long id,Task task);
}
