
public class InnerClassesDemo {
	static class A{
		String name;
		int age1;
		Integer age;
	}
	public static void main(String [] args) {
		InnerClassesDemo.A a = new InnerClassesDemo.A();
		System.out.println(a.name);
		System.out.println(a.age1);
		System.out.println(a.age);
	}

}
