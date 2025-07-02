package com.app.todoapp.models.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CreateTaskResponseDto {
    private Long id;
    private String title;
    private  boolean completed;

}
