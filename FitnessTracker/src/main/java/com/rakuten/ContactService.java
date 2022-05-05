package com.rakuten;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rakuten.ContactRepository;
import com.rakuten.ContactUs;

@Service
public class ContactService {
	
	@Autowired
	ContactRepository contact_repository;

	public void send(ContactUs message) {
		contact_repository.save(message);
		
	}

}