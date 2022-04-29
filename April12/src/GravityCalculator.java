
public class GravityCalculator {
	public static void main(String[] args) {
		double gravity = -9.81; //Earth gravity in m/s^2
		double fallingTime = 10.0;
		double initialPosition = 0.0;
		double finalPosition = 0.0;
		
		
		System.out.println("The object's position after" + fallingTime +" seconds is "+ finalPosition+ " m");
		
		float x;
		// by using the formula...
		//x(t)=0.5*at^2 + vit +xi;
		//x is distance;
		//a is acceleration due to gravity;
		
		double t = Math.pow(10, 2);

		x = (float) (0.5*(-9.81)*t + 0.0 +0.0);
		System.out.println("X = "+x);
		
	}
}
