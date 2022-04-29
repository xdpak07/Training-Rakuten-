package com.rakuten;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/get-started")
public class ApplicationControl{
	
	@PostMapping("/applicationForm")
	String applicationDetails(RequestBody AppplicattionDetals appplicationDetails) {
		return "Recived successfully";
	}
}
