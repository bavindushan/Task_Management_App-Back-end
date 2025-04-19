package edu.icet.controller;

import edu.icet.dto.Task;
import edu.icet.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task")
@RequiredArgsConstructor
public class TaskController {

    final TaskService service;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    private void addTask(@RequestBody Task task){
        service.add(task);
    }
}
