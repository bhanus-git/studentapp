package com.example.studentapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Student_TBL")
@Data
@AllArgsConstructor(staticName = "bind")
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue
    private int studentId;
    private String studentName;
    private String address;
}
