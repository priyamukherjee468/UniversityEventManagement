package com.example.UniversityEventManagement.Model;




import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Event {



    private Integer eventId;

    //@NotBlank
    private String eventName;

    //@NotBlank
    private String locationOfEvent;

   // @NotNull
    private String date;

    //@NotNull
    private String startTime;

    //@NotNull
    private String endTime;


}

