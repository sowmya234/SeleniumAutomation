
public class SuperParentSample {
	
	static String name="Java Project Main object";
	
	public SuperParentSample() {
		System.out.println("Parent class constructor..!!!");
	}
	
	public void getData() {
		System.out.println("Parent class method");
	}
	
	public static void main(String[] args) {
		
		System.out.println("name from main class is : "+name);

	}

}
