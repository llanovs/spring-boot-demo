package com.spring.demo.repository;

import com.spring.demo.model.Topic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepository extends CrudRepository <Topic, String> {
}
