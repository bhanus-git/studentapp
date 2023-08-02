package com.example.studentapp.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentRequest {

    @NotBlank( message = " Student Name shouldn't be empty / null ")
    private String studentName;
    @NotBlank(message = "address should not be empty / null ")
    private String address;
}
