package edu.icet.service.impl;

import edu.icet.dto.Task;
import edu.icet.entity.TaskEntity;
import edu.icet.repository.TaskRepository;
import edu.icet.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {

    final TaskRepository repository;
    final ModelMapper mapper;

    @Override
    public void addTask(Task task) {
        repository.save(mapper.map(task, TaskEntity.class));
    }

    @Override
    public void updateTask(Task task) {
        repository.save(mapper.map(task, TaskEntity.class));
    }

    @Override
    public void deleteTask(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<Task> getAll() {
        ArrayList<Task> list = new ArrayList<>();
        List<TaskEntity> all = repository.findAll();

        all.forEach(taskEntity -> list.add(mapper.map(taskEntity, Task.class)));
        return list;
    }

    @Override
    public List<Task> getByUserId(Integer id) {
        ArrayList<Task> list = new ArrayList<>();
        List<TaskEntity> byUserId = repository.findByUserId(id);

        byUserId.forEach(taskEntity -> list.add(mapper.map(taskEntity, Task.class)));
        return list;
    }
}
