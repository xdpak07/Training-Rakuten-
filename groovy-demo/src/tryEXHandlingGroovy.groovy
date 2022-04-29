
class tryEXHandlingGroovy {
	static void main(String[] args) {
		try {
			def arr = new int[3];
			arr[5] = 5;
		}catch(Exception ex) {
			println("Catching the Exception");
		}
		println("Let's move on after the exception");
		
	}
}

