package edu.icet.controller;

import edu.icet.dto.Task;
import edu.icet.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/task")
public class TaskController {

    final TaskService service;

    @PostMapping("/create")
    public void addTask(@RequestBody Task task){
        service.addTask(task);
    }

    @PutMapping("/update")
    public void updateTask(@RequestBody Task task){
        service.updateTask(task);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTask(@PathVariable Integer id){
        service.deleteTask(id);
    }

    @GetMapping("/get-all")
    public List<Task> getAll(){
        return service.getAll();
    }

    @GetMapping("/get-by-userid/{id}")
    public List<Task> getByUserId(@PathVariable Integer id){
        return service.getByUserId(id);
    }
}
