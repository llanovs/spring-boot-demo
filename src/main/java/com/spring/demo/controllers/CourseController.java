package com.spring.demo.controllers;

import com.spring.demo.model.Course;
import com.spring.demo.model.Topic;
import com.spring.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService servise;

    @RequestMapping("/topic/{topicId}/course")
     public List<Course> getCourses(@PathVariable String  topicId){
          return  servise.getAllCourses(topicId);
     }


     @RequestMapping("/topic/{topicId}/course/{id}")
     public Course getById( @PathVariable String  id){
        return servise.getCourseById(id);
     }


     @RequestMapping(method = RequestMethod.POST, value = "/topic/{topicId}/course")
     public void add(@RequestBody Course course, @PathVariable String topicId){
        course.setTopic(new Topic(topicId, "", ""));
        servise.addCourse(course);
     }


    @RequestMapping(method = RequestMethod.DELETE, value = "/topic/{topicId}/course/{id}")
    public void delete(@PathVariable String id){
        servise.deleteCourse(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topic/{topicId}/course")
    public void uodate(@RequestBody Course course, @PathVariable String topicId){
        course.setTopic(new Topic(topicId, "", ""));
        servise.updateCourse(course);
    }

}
