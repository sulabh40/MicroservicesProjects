package io.javabrains.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class TopicService {
	@Autowired
	private TopicRepository topicRepository;
	
	public List<Topic> getTopics(){
		//return list;
		List<Topic> topics= new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
return topics; 
	}

	public void addTopics(@RequestBody Topic topic) {
		// TODO Auto-generated method 
	topicRepository.save(topic);
		
	}

}
