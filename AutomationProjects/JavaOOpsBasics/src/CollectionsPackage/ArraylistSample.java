package CollectionsPackage;

import java.util.ArrayList;

public class ArraylistSample {
	//arraylist can accept duplicate values
	//can insert value at any index
	//array has fixed size, while arraylist size can grow dynamically
	//ArrayList,LinkedList,vector-implementing List interface

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("Sowmya");
		al.add("BTS");
		al.add("Jungkook");
		al.add("sample");
		al.add("RM");
		al.add("Suga");
		al.add("V");
		al.add("Jhope");
		al.add("Jin");
		al.add("Jimin");
		
		al.remove(3);
		
		System.out.println(al.get(4));
		System.out.println(al.contains("BTS"));
		System.out.println(al.size());
		System.out.println(al.lastIndexOf(al));
		System.out.println(al.indexOf("Jhope"));
		System.out.println(al.isEmpty());

	}

}
