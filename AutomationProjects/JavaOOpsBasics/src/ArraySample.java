
public class ArraySample {
	
	public static void main(String[] args) {
		
		//array declaration
		//new is used to allocate memory to the array a
		int[] a=new int[10];
		
		//intializing the values
		
		a[0]=07;
		a[1]=123;
		a[2]=43;
		a[3]=56;
		a[4]=33;
		a[5]=87;
		a[6]=54;
		a[7]=77;
		a[8]=74;
		a[9]=82;
		
		//retrieving the values from array
		System.out.println("Array values are: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Reverse of an Array: ");
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
	}

}
