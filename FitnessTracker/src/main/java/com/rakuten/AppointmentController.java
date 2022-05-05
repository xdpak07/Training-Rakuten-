package com.rakuten;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.rakuten.AppointmentService;
import com.rakuten.Appointments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {
	
	@Autowired
	AppointmentService appointment_service;
	
	@PostMapping("/create")
	@ResponseStatus(code = HttpStatus.CREATED)
	void makeAppointment(@RequestBody Appointments appointment) {
		System.out.println(appointment);
		appointment_service.createAppointment(appointment);
	}
	
	@GetMapping("/view")
	List<Appointments> fetchAllAppointments(){
		return appointment_service.getAllAppointments();
	}
	
	@GetMapping("/view/{name}")
	Appointments fetchAppointmentByName(@PathVariable String name) {
		return appointment_service.getAppointmentByCustomerName(name);
	}
	
}