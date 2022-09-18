
public class StaticAndNonStatic {
	
	int a; //Instance variables
	int b;
	static int c; //class variable
	static int i;
	
	static {
		
		c=99;
		i=0;
	}
	
	public StaticAndNonStatic(int a, int b) {
		this.a=a;
		this.b=b;
		i++;
		System.out.println("i value is "+i);
	}
	
	public void address() {
		System.out.println(b);
	}
	
	public static  void getCValue() {
		System.out.println("value of c is "+c);
		//static methods only uses/able to access static variables.
	}//This method is class method as it is static
	

	public static void main(String[] args) {

		StaticAndNonStatic sans=new StaticAndNonStatic(6,9);
		StaticAndNonStatic sans1=new StaticAndNonStatic(10,74);
		sans.address();
		sans1.address();
		StaticAndNonStatic.c=7;
		StaticAndNonStatic.getCValue();

	}

}
