package com.example.UniversityEventManagement.Model;




import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data

public class Student {



    private Integer studentId;

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    @Min(value = 18, message = "Age must be at least 18")
    @Max(value = 25, message = "Age must not exceed 25")
    private int age;


    private String department;



}

