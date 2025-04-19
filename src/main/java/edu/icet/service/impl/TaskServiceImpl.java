package edu.icet.service.impl;

import edu.icet.dto.Task;
import edu.icet.entity.TaskEntity;
import edu.icet.repository.TaskRepository;
import edu.icet.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {

    private TaskRepository repository;
    private ModelMapper mapper;

    @Override
    public void add(Task task) {
        repository.save(mapper.map(task, TaskEntity.class));
    }
}
