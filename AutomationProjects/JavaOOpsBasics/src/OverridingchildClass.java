
public class OverridingchildClass {
	
	public void concert(String s1) {
		System.out.println("ChildclassMethod BTS concert is on march23 in Seoul and Members are: "+s1);
	}
	public void Members(int mem) {
		System.out.println("ChildclassMethod BTS concert is on march23 in Seoul and no.of Members are: "+mem);
	}
	
	public static void main(String[] args) {
		OverridingchildClass occ=new OverridingchildClass();
		occ.concert("SOmu BTS RM SUGA JIN JHOPE JIMIN V JK");
		occ.Members(7);
	}

}
