
public class SmallestNoMatrix {

	public static void main(String[] args) {
		
		//int[][] matrix=new int[3][3];
		int matrix[][]= {{14,3,4},{5,8,7},{2,7,6}};
		int min=matrix[0][0];
		int mincolumnIndex=0;
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				
				System.out.print(matrix[i][j]+" ");
				if(matrix[i][j]<min) {
					min=matrix[i][j];
					mincolumnIndex=j;
					
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("min "+min+ " " );
		
		minMatrix();

	}
	
	public static void minMatrix() {
		int m[][]= {{2,4,5},{3,4,0},{1,2,9}};
		int minimum;
		for(int i=0;i<m.length;i++) {
			minimum=m[0][0];
			for(int j=0;j<m[i].length;j++) {
				 //
				System.out.print(m[i][j]+" ");
				if(m[i][j]<minimum) {
					minimum=m[i][j];
					//System.out.println(i+" "+j);
				
				}
				
			}
			//System.out.println();
			System.out.println("min of this row "+i+"is "+minimum);
			
			
		}
	}

}
