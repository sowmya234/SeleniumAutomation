package CollectionsPackage;

import java.util.HashSet;
import java.util.Iterator;

public class SetInterfaceSample {
	//Realtime example for hashset is- ecommerce website, where items are added to set, it allows duplicate values so here list is used.
	//set is used when only unique items are allowed, such as email id registraion etc.

	public static void main(String[] args) {
		
		//Hashset,treeset,LinkedHashset- implementing set interface
		//List accepts duplicate values, But set doesnot accept duplicate values
		//There is no guarentee that elements stored in sequential order.They store in Random order.
	
		HashSet<String> hs=new HashSet<String>();
		
		hs.add("USA");
		hs.add("Korea");
		hs.add("India");
		hs.add("UAE");
		hs.add("Europe");
		hs.add("Aus");
		//Even by adding duplicate values this will show only one value in results
		hs.add("Europe");
		
		hs.remove("Aus");
		System.out.println(hs.contains("Korea"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
		//Iterating through hashset using iterator
		Iterator<String> it=hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
