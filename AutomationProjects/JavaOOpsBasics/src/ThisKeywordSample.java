
public class ThisKeywordSample {
	
	int num1=10;
	
	public void getData() {
		int num1=63;
		System.out.println("local varaible num1 value: "+num1);
		System.out.println("local varaible num1 value: "+this.num1);
		//this refers to current object - object scope lies in class level
		
	}

	public static void main(String[] args) {

		
		ThisKeywordSample tks=new ThisKeywordSample();
		tks.getData();
		
		

	}

}
