package com.spring.demo.controllers;

import com.spring.demo.model.Topic;
import com.spring.demo.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;


    @RequestMapping("/topic")
     public List<Topic> getTopics(){
          return  topicService.getAllTopics();
     }


     @RequestMapping("/topic/{id}")
     public Topic getTopic( @PathVariable String  id){
        return topicService.getTopicById(id);
     }


     @RequestMapping(method = RequestMethod.POST, value = "/topic")
     public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
     }


    @RequestMapping(method = RequestMethod.DELETE, value = "/topic/{id}")
    public void deleteTopic(@PathVariable String id){
        topicService.deletedTopic(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topic/{id}")
    public void uodateTopic(@RequestBody Topic topic, @PathVariable String id){
        topicService.updateTopic(id, topic);
    }

}
