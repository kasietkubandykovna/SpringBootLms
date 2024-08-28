package service.serviceImpl;

import entity.Task;
import service.TaskService;

import java.util.List;

public class TaskServiceImpl implements TaskService {
    @Override
    public void saveTask(Task task) {

    }

    @Override
    public List<Task> getAllTasks() {
        return List.of();
    }

    @Override
    public Task getTaskById(int id) {
        return null;
    }

    @Override
    public void deleteTaskById(int id) {

    }

    @Override
    public void updateTask(Long id, Task task) {

    }
}
