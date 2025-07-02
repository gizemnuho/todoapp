package com.app.todoapp.services;


import com.app.todoapp.models.dto.CreateTaskResponseDto;
import com.app.todoapp.models.entity.Task;
import com.app.todoapp.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor//final değişkenleri için arka plan con oluştuur

public class TaskService {

    private final TaskRepository taskRepository;


    public List<Task> getAllTasks() {
        return taskRepository.findAll();


    }

    public CreateTaskResponseDto createTask(String title) {
        Task task = new Task();
        task.setTitle(title);
        task.setCompleted(false);
        task =taskRepository.save(task);

        return new CreateTaskResponseDto(task.getId(),task.getTitle(), task.isCompleted());
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

    public void toggleTask(Long id) {
       // Task task = taskRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalis task id"));
        Optional<Task> optionelTask= taskRepository.findById(id);
        if (optionelTask.isPresent()){
            Task task= optionelTask.get();
            task.setCompleted(true);
            taskRepository.save(task);
        }

    }
}
