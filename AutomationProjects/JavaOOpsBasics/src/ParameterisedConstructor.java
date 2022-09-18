
public class ParameterisedConstructor {
	
	public ParameterisedConstructor() {
		System.out.println("default constructor");
	}
	public ParameterisedConstructor(String str) {
		System.out.println("parameterised constructor executed by : " +str);
	}
	

	public static void main(String[] args) {

		ParameterisedConstructor pc=new ParameterisedConstructor();
		ParameterisedConstructor pc1=new ParameterisedConstructor("Sowmya");

	}

}
