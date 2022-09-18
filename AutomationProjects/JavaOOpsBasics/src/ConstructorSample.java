
public class ConstructorSample {
	
	
	public ConstructorSample() {
		
		System.out.println("This is constructor block ");
	}
	
	public void method() {
		System.out.println("This is method block which gets executed after creating the object and called by using its object.");
		
	}

	public static void main(String[] args) {
		
		//constructor has No return type
		//constructor is called by default when object is created 
		//constructor is used to intantiate variables.. so that to initialize the varables we are not reuired to call any methods
		//while creating object , it gets called and initialization takes place.
		
		ConstructorSample cs=new ConstructorSample();
		
		

	}

}
