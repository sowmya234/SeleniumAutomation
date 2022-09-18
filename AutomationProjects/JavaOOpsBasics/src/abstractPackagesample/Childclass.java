package abstractPackagesample;

public class Childclass extends Parentclass {

	public static void main(String[] args) {
		Childclass cc=new Childclass();
		cc.method1();
		cc.method2();
		cc.method3();
		cc.method4();

	}

	@Override
	void method3() {
		System.out.println("This is abstract method3 defined in child class");
		
	}

	@Override
	void method4() {
		System.out.println("This is abstract method4 defined in child class");
		
	}

}
