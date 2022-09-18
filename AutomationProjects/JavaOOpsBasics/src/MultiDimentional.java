
public class MultiDimentional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]=new int[2][3];
		a[0][0]=9;
		a[0][1]=18;
		a[0][2]=23;
		a[1][0]=32;
		a[1][1]=17;
		a[1][2]=22;
		
		int b[][]= {{6,8},{4,10},{7,8}};
		
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<=b[i].length-1;j++) {
				System.out.println(b[i][j]);
			}
			
		}
		

	}

}
