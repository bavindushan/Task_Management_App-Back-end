package edu.icet.service;

import edu.icet.dto.Task;

import java.util.List;

public interface TaskService {
    void addTask(Task task);

    void updateTask(Task task);

    void deleteTask(Integer id);

    List<Task> getAll();

    List<Task> getByUserId(Integer id);
}
