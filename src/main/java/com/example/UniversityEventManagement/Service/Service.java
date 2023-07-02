package com.example.UniversityEventManagement.Service;

import com.example.UniversityEventManagement.Model.Event;
import com.example.UniversityEventManagement.Model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;




@org.springframework.stereotype.Service
public class Service {
         static List<Student> st=new ArrayList<>();

        {
            st.add(new Student(101,"priya","Roy",23,"EE"));
        }
        static List<Event> event1=new ArrayList<>();
        {
            event1.add(new Event(12,"B'Day","Monalisa","12-07-23","7.00 pm","10.00 pm"));
        }


    public void addStudent(Student stModel){
        st.add(stModel);
    }

        public List<Student> getAll(){
            return st;
        }

        public Student getById(int id){
            for(Student stud:st){
                if(stud.getStudentId()==id){
                    return stud;
                }
            }
            return null;
        }

        public void updateDepartment(int id, String dept){
            Student stud=getById(id);
            stud.setDepartment(dept);
        }

        public void deleteStudent(int id){
            Predicate<? super Student> stud= st1->st1.getStudentId()==id;
            st.removeIf(stud);
        }




        public void addEve(Event em){
            event1.add(em);
        }

        public void updateEvent(Event em, int eveId){
            for(Event eve:event1){
                if(eve.getEventId()==eveId){
            eve.setEventId(em.getEventId());
                    eve.setEventName(em.getEventName());
                    eve.setDate(em.getDate());
                    eve.setStartTime(em.getStartTime());
                    eve.setEndTime(em.getEndTime());

                    eve.setLocationOfEvent(em.getLocationOfEvent());
                }
            }
        }

        public void deleteEvent(int eventId) {
            Predicate<? super Event> eve=eve1->eve1.getEventId()==eventId;
            event1.removeIf(eve);
        }

        public List<Event> getEventDates(String date1) {
            List<Event> l=new ArrayList<>();
            for(Event eve:event1){
                if(eve.getDate().equals(date1)){
                    l.add(eve);
                }
            }
            return l;
        }
}
