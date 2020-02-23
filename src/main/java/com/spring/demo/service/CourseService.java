package com.spring.demo.service;

import com.spring.demo.model.Course;
import com.spring.demo.model.Topic;
import com.spring.demo.repository.CourseRepository;
import com.spring.demo.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository repository;

    public List<Course> getAllCourses(String id){
       return repository.findByTopicId(id);
    }

    public Course getCourseById(String id) {
        return repository.findById(id).orElse(null);
    }

    public void addCourse(Course course) {
        repository.save(course);
    }

    public void deleteCourse(String id) {
        repository.deleteById(id);
    }

    public void updateCourse(Course course) {
        repository.save(course);
    }

}
