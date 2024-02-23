package com.ty.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "EmployeeData")
public class Employee {
    @Id
    private String id;
    private String name;
    private double salary;
}
