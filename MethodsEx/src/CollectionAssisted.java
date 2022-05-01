import java.util.*;
public class CollectionAssisted {
	public static void main(String[] args) {
		//creating arraylist

		System.out.println("ArraayList Mixed data");
		ArrayList al=new ArrayList();
		al.add("Guneet");
		al.add(18);
		al.add(13.9);
		System.out.println(al);

		System.out.println("ArrayList Specific Data");
		ArrayList<String> city=new ArrayList<String>();
		city.add("Guneet");
		city.add("fbfg");
		System.out.println(city);

		System.out.println("--------##-------");
		System.out.println("Vector");
		Vector vc=new Vector();
		vc.addElement(8989);
		vc.addElement("guneet");
		System.out.println(vc);
		
		//creating Linkedlist
		System.out.println("\n");
		System.out.println("LinkedList");
		LinkedList<String> ls= new LinkedList<String>();
		ls.add("ghjg");
		ls.addLast("fg");
		System.out.println(ls);
		//Iterator is a cursor that points to an object as java doesn't support pointers
		Iterator<String> itr=ls.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		//creating hashset
		//hashset does not maintain order of insertion
		System.out.println("Creating HashSet");
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(54);
		hs.add(65);
		hs.add(12);
		hs.add(10);
		System.out.println(hs);
		
		System.out.println("Creating Linked HashSet");
		LinkedHashSet<Integer> hs2=new LinkedHashSet<Integer>();
		hs2.add(54);
		hs2.add(65);
		hs2.add(12);
		hs2.add(10);
		System.out.println(hs2);
	}

}
