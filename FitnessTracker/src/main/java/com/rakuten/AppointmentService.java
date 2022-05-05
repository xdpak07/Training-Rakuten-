package com.rakuten;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.rakuten.Appointments;

@Service
public class AppointmentService {
	
	List<Appointments> appointments = new ArrayList<>();
	
	
	public void createAppointment(Appointments appointment) {
		appointments.add(appointment);
	}
	

	public List<Appointments> getAllAppointments() {
		return appointments;
	}
	

	public Appointments getAppointmentByCustomerName(String customerName) {
		for (Appointments app : appointments) {
			if(app.getCustomer().getName().equals(customerName)) {
				return app;
			}
		}
		return new Appointments();
	}
}