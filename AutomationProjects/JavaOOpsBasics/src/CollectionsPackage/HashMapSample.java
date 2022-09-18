package CollectionsPackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapSample {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		hm.put(1, "Amazon");
		hm.put(2, "Flipkart");
		hm.put(3, "Myntra");
		hm.put(4, "Nyka");
		hm.put(5, "Purple");
		hm.put(6, "draft");
		System.out.println(hm.get(4));
		hm.remove(5);
		Set hmset=hm.entrySet();
		Iterator it =hmset.iterator();
		while(it.hasNext()) {
			Map.Entry mpIt=(Map.Entry)it.next();
			System.out.println(mpIt.getKey());
			System.out.println(mpIt.getValue());
		}

	}

}
