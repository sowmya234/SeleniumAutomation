
public class WhileTest {

	public static void main(String[] args) {
		
		int k=10;
		
		while(k<20) {
			System.out.println("This is sowmya and loop is"+k);
			k++;
			if(k==20) {
				System.out.println("K is out of the while condition "+ k);
				method1();
				method2();
			}
		}
	}
	
	public static void method1() {
		String s1="WalmartPvtLtd";
		String s2="";
		char ch;
		//while(s1.length()>0) {
			//for(int i=0;i<s1.length();i++) {
				for(int i=s1.length()-1;i>=0;i--)	{
				ch=s1.charAt(i);
				s2=s2+ch;
			}
			
		//}
		System.out.println(s2);
	}
	
	public static void method2() {
		int dowhile=16;
		
		do {
			System.out.println("This is do while loop , where the loop executes and then checks for the condition\n dowhile loop atleat one time even condition is false "+dowhile);
			dowhile++;
			
		}while(dowhile<20);
		
	}

}
