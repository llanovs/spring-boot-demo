package com.spring.demo.service;

import com.spring.demo.model.Topic;
import com.spring.demo.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository repository;

    private List<Topic> topics = new ArrayList<>(Arrays.asList( new Topic("spring", "Spring Boot", "Quick start"),
                    new Topic("1", "Java", "Java 8")));

    public List<Topic> getAllTopics(){
       List<Topic> topics = new ArrayList<>();
       repository.findAll().forEach(topics::add);
       return topics;
    }

    public Topic getTopicById(String id) {
       // return topics.stream().filter(t -> t. getId().equals(id)).findFirst().get();
        return repository.findById(id).orElse(null);
    }

    public void addTopic(Topic topic) {
        repository.save(topic);
    }

    public void deletedTopic(String topicId) {
       // topics.removeIf(t->t.getId().equals(topicId));
        repository.deleteById(topicId);
    }

    public void updateTopic(String id, Topic topic) {
        repository.save(topic);
//        for (int i = 0; i < topics.size(); i++){
//            if(topics.get(i).getId().equals(id))
//                topics.set(i,topic);
//        }
    }

}
