package assignment2;

import java.util.ArrayList;

public class BankDemo {

	public static void main(String[] args) {

		ArrayList<Customer> customers = new ArrayList<>();
		
		for(int i = 0; i < 3; i++) {
			String name = "rakuten"+i+"ian";
			String address = "Address"+i*100;
			String email = "rakuten+ "+i+" +@gamil.com";
			String phoneNo = "8987567877"+i;
			
			Customer cus = new Customer(name , address , email, phoneNo);
			customers.add(cus);
		}
		
		customers.forEach((cus) ->
		  System.out.println(cus)
				);
		
		
	}

}