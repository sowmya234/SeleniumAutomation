
//super keyword concept
//generally the objects or methods gets overrided when we use same names for child class 
//to avoid that we can use super keyword
//syntax:  super.Objectname or super.methodname


public class SuperChildSample extends SuperParentSample{
	
	String name="Child class object";
	
	public SuperChildSample() {
		super(); //This should always be first line
		System.out.println("Child class constructor..!!!");
	}
	
	public void getData() {
		super.getData();
		System.out.println("child class object is : "+name);
		System.out.println(super.name);
	}
	public static void main(String[] args) {
		
		SuperChildSample scs=new SuperChildSample();
		scs.getData();
		
	}

}
