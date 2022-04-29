import java.util.Scanner;

public class FoodCorporation {
	public static void main(String[] args) {
		
		//float time;
		//float basePay;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the values of Employee :");
		float time = s.nextFloat(); //time in hours;
		float basePay = s.nextFloat();
		
		
		if(time<=60) {
			float BasePay = (time)*(basePay);
			float overTime = (float) ((basePay)*1.5);
			
			float payInDollar = ((BasePay)/74);
			System.out.println("pay = $"+payInDollar);
		}
		else {
			System.out.println("Error! the value HOURS) are enter is not valid");
		}
	}
}
