
public class ForLoopTest {

	public static void main(String[] args) {
		
		System.out.println("Nested for loop!!!");
		int count=0;
		for(int i=1;i<10;i++) {
			for(int j=i;j<5;j++) {
				System.out.println("inner loop"+j);
				count++;
			}
		}
		System.out.println(count);
		pattern1();
		pattern2();
		pattern3();
		Numberpatter2();
		Numberpatter();
	}
	
	public static void pattern1() {
		for(int i=0;i<6;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(j+" ");
				//System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void pattern2() {
		int i, j, row = 6;       
		//Outer loop work for rows  
		for (i=0; i<row; i++)   {  
		//inner loop work for space      
			for (j=2*(row-i); j>=0; j--) {  
		//prints space between two stars      
				System.out.print(" ");   
		}   
		//inner loop for columns  
			for (j=0; j<=i; j++ )   {   
		//prints star      
				System.out.print("* ");   
		}   
		//throws the cursor in a new line after printing each line  
		System.out.println();   
		}   
	}
	public static void pattern3() {
		int i, j, row = 6;       
		//Outer loop work for rows  
		for (i=0; i<row; i++)   {  
		//inner loop work for space      
			for (j=row-i; j>1; j--)   {  
		//prints space between two stars  
				System.out.print(" ");   
		}   
		//inner loop for columns  
			for (j=0; j<=i; j++ )   {   
		//prints star      
				System.out.print("* ");   
		}   
		//throws the cursor in a new line after printing each line  
		System.out.println();   
		}
	}
	public static void Numberpatter() {
		int i,j;
		int k=1;
		for(i=0;i<4;i++) {
			for(j=1;j<=4-i;j++) {
				System.out.print(k+"  ");
				k++;
			}
			System.out.println();
		}
	}
	public static void Numberpatter2() {
		int i,j;
		int k=1;
		for(i=1;i<5;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(k+"  ");
				k++;
			}
			System.out.println();
		}
		System.out.println("****************************");
	}

}


