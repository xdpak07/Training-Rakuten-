package com.rakuten;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/print")
public class PrintController {
	
@GetMapping("/print")
String print() {
	return "printed";
}
@PostMapping
String output() {
	return "value received";
}
}