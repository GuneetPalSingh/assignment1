import java.util.*;
public class mapDemo {
	public static void main(String[] args) {
		// map
		//Hashmap
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
		hm.put((-1),"Tim");    
		hm.put(2,"Mary");    
		hm.put(3,"Catie");   
		System.out.println("\nThe elements of Hashmap are ");  
		/*
		 * for(Object x : arr)
		 * 
		 * 
		 */


		for(Map.Entry m:hm.entrySet()){    
			System.out.println(m.getKey()+" "+m.getValue());    
		}
		//HashTable
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
		ht.put(40,"Ales");  
		ht.put(10,"Rosy");  
		ht.put(6,"Jack");  
		ht.put(30,"John");  
		System.out.println("\nThe elements of HashTable are ");  
		for(Map.Entry n:ht.entrySet()){    
			System.out.println(n.getKey()+" "+n.getValue());    
		}
		//TreeMap prints value in sorted order
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		map.put(9,"Carlotte"); 
		map.put(10,"Catie"); 
		map.put(3,"Annie");    


		System.out.println("\nThe elements of TreeMap are ");  
		for(Map.Entry l:map.entrySet()){    
			System.out.println(l.getKey()+" "+l.getValue());    
		}    
	}
}