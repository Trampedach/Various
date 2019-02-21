package io.kursus.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("Spring", "Spring1 Framework", "Spring1 framework Description"),
			new Topic("C#", "Microsoft .net", ".net framework Description"),
			new Topic("Pascal", "Borland", "Borland framework Description"),
			new Topic("C++", "Turbo", "Turbo c++ framework Description"),
			new Topic("Python", "Unknown", "Unknown"),
			new Topic("JavaScript", "Unknown", "Unknown"),
			new Topic("Cobol", "Ibm Framework", "Ibm Cobol Description"),
			new Topic("PL1", "Ibm Framework", "Ibm Pl1 Description")));
	
	public List<Topic> getAllTopics() {
		return topics;
	}
	
	public Topic getTopic(String id) {
		
		
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		
	}
	
	public void addTopic(Topic topic) {
		
		topics.add(topic);
	}

	public void updateTopic(String id, Topic topic) {

		for(int i = 0; i < topics.size(); i++) {
			Topic t = topics.get(i);
			
			if (t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
	}

	public void deleteTopic(String id) {

		topics.removeIf(t -> t.getId().equals(id));
		
	}
	
}
