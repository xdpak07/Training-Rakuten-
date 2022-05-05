package com.rakuten;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import com.rakuten.*;
import com.rakuten.AppointmentController;

@RestController
@RequestMapping("/contact")
public class ContactController {
	
	@Autowired
	ContactService contact_service;
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	void sendMessage(@RequestBody ContactUs message) {
	
	//	@RequestMapping
	//	 Request Body ->
		  {
			    "name": "deepak",
			    "phoneNumber": 999998888,
			    "email": "abc123@gmail.com",
		  }
		
		contact_service.send(message);
	}
	

}