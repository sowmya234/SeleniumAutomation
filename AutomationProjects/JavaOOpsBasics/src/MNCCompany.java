
public class MNCCompany implements interfaceClass,Resources{

	public static void main(String[] args) {
		
		System.out.println("-------------");
		interfaceClass ic=new MNCCompany();
		ic.Developers();
		ic.Testers();
		ic.SupportTeam();
		
		MNCCompany mnc=new MNCCompany();
		mnc.MainclassMethod1();
		mnc.MainclassMethod2();
		
		Resources r=new MNCCompany();
		r.MemberNames();
		

	}

	@Override
	public void Testers() {
		System.out.println("This is Testers method invoked from interface ");
		
	}

	@Override
	public void Developers() {
		System.out.println("This is Developers method invoked from interface");
		
	}

	@Override
	public void SupportTeam() {
		System.out.println("This is SupportTeam method invoked from interface");

	}
	public void MainclassMethod1() {
		System.out.println("main class method ");
	}
	
	public void MainclassMethod2() {
		System.out.println("main class method 2 ");
	}

	@Override
	public void MemberNames() {
		String str="Interface Class";
		System.out.println(str);
		for(int i=str.length()-1;i>0;i--) {
			System.out.print(str.charAt(i));
		}
		
	}

}
