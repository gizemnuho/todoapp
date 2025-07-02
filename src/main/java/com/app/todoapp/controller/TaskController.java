package com.app.todoapp.controller;


import com.app.todoapp.models.dto.CreateTaskRequestDto;
import com.app.todoapp.models.dto.CreateTaskResponseDto;
import com.app.todoapp.models.entity.Task;
import com.app.todoapp.services.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/tasks")
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }


    @GetMapping
    public  ResponseEntity<List<Task>> getTasks(){
        return (ResponseEntity<List<Task>>) taskService.getAllTasks();

    }
    @PostMapping
    public ResponseEntity<CreateTaskResponseDto> createTask(@RequestBody CreateTaskRequestDto requestDto){// http://localhost:8080/api/tasks/title=Gizem

        CreateTaskResponseDto responseDto = taskService.createTask(requestDto.getTitle());


        return ResponseEntity.ok(responseDto);
    }
    @GetMapping("/{id}/delete")//http://localhost:3306/api/tasks/1/delete
    public String deleteTasks(@PathVariable Long id){
       taskService.deleteTask(id);
        return "redirect:/";
    }
    @GetMapping("/{id}/toggle")
    public String toggleTasks(@PathVariable Long id){
        taskService.toggleTask(id);
        return "redirect:/";
    }
}
