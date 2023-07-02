package com.example.UniversityEventManagement.Controller;




import com.example.UniversityEventManagement.Model.Event;
import com.example.UniversityEventManagement.Model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class Controller {

    @Autowired
    private Service service;

    @PostMapping("addStudent")
    public ResponseEntity<String> addStudent(@RequestBody Student stModel){
        service.add(stModel);
        return new ResponseEntity<>("Created", HttpStatus.CREATED);

    }
    @GetMapping("students")
    public List<Student> getAllStudents(){
        return service.getAll();
    }
    @GetMapping("/get-by-id/Id/{id}")
    public Student getById(@PathVariable int id){
        return service.getById(id);
    }
    @PutMapping("/update-department")
    public void updateDepartment(@RequestParam int id,@RequestParam String dept){
        service.updateDepartment(id,dept);
    }
    @DeleteMapping("/deleteStudent")
    public void deleteStudent(@RequestParam int id){
        service.deleteStudent(id);
    }



    @PostMapping("/add-event")
    public void addEvent(@RequestBody Event em){
        service.addEvent(em);
    }
    @PutMapping("/update-event")
    public void updateEvent(@RequestBody Event em ,@RequestParam int eveId){
        service.updateEvent(em,eveId);
    }
    @DeleteMapping("/delete-event")
    public void deleteEvent(@RequestParam int eventId){
        service.deleteEvent(eventId);
    }
    @GetMapping("/GetAllDatesOfEvent/date/{date}")
    public List<Event> getEventDates(@PathVariable String date){
        return service.getEventDates(date);
    }

}

