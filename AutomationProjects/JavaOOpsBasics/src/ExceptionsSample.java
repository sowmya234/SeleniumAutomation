
public class ExceptionsSample {

	public static void main(String[] args) {
		try {
			//realtime example-purchase failed
			//int k=2/0;
			int[] a=new int[3];
			System.out.println(a[4]);
		}
		catch(ArithmeticException et) {
			System.out.println("Arithmetic Exception block");
		}
		catch(IndexOutOfBoundsException et) {
			System.out.println(" IndexOutOfBoundsException block");
		}
		catch(Exception e) {
			//retry purchase-Christmas offer example
			System.out.println("Generic Exception block");
		}
		finally {
			//real time exp-Irresective of whether the test passes or fails, we need to delete the cookies 
			//this block gets executed irrespective of exception thrown or not.
		}

	}

}
