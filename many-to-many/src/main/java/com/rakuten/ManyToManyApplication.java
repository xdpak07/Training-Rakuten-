package com.rakuten;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ManyToManyApplication implements CommandLineRunner{
	
	@Autowired
	private TagRepository tagsRepository;
	
	@Autowired
	private PostRepository postRepository;
	

	public static void main(String[] args) {
		SpringApplication.run(ManyToManyApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception{
		postRepository.deleteAllInBatch();
		tagsRepository.deleteAllInBatch();
		
		//*************************************************
		
		//Create a post
		Posts post = new Posts("Hibernate Many to Many Example with Spring Boot",
				"Learn how to map a many to many relationship using hibernate",
				"Entire Post content with Sample code");

		// Create two tags
		Tags tag1 = new Tags("Spring Boot");
		Tags tag2 = new Tags("Hibernate");


		// Add tag references in the post
		post.getTags().add(tag1);
		post.getTags().add(tag2);

		// Add post reference in the tags
		tag1.getPosts().add(post);
		tag2.getPosts().add(post);

		postRepository.save(post);

		// *************************************************

	}
}


