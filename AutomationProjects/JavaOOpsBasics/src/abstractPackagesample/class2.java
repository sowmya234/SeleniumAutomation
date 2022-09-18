package abstractPackagesample;

public class class2 extends class1{
	int a=15;
	String k="Childclass";
	public static void main(String[] args) {
		class1 c1=new class1();
		System.out.println("parent class object variable: "+c1.a);
		System.out.println("parent class object variable: "+c1.k);
		
		class2 c2=new class2();
		System.out.println("child class object variable: "+c2.a);
		System.out.println("child class object variable: "+c2.k);
	}

}
