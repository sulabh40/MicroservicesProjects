package io.javabrains.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;

	@RequestMapping("/gettopics")
	public List<Topic> getTopics() {
		return topicService.getTopics();
	}

	@RequestMapping(method = RequestMethod.POST, value="/topics")
	public Topic addTopics(@RequestBody Topic topic) {
		// TODO Auto-generated method 
		topicService.addTopics(topic);
		topic.setDescription("Default Desc");
		return topic;
	}

}
