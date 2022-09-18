
public class OverloadingSample {
	//function overloading
	//argument should be different
	//argument data type should be different

	public void getData() {
		System.out.println("getData method with no arguments ");
	}
	public void getData(int a) {
		System.out.println("getData method with one arguments... "+a);
	}
	public void getData(String a) {
		System.out.println("getData method with one arguments... "+a);
	}
	public void getData(int a,int b) {
		System.out.println("getData method with one arguments... "+a+" "+b);
	}
	public void getData(String a,String b) {
		System.out.println("getData method with one arguments... "+a+" "+b);
	}
	public void getData(String a,int b) {
		System.out.println("getData method with one arguments... "+a+" "+b);
	}
	

	public static void main(String[] args) {
		
		OverloadingSample ols=new OverloadingSample();
		ols.getData();
		ols.getData(7);
		ols.getData("BTS");
		ols.getData(7, 1);
		ols.getData("SOmu", "BTS RM SUGA JIN JHOPE JIMIN V JK");
		ols.getData("EuphoriaSOmu", 7);

	}

}
