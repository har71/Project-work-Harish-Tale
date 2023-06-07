package selenium1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collection2 {

	public static void main(String[] args) 
	{
		//Hashset
		HashSet h= new HashSet();
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(40);
		h.add("abc");
		h.add("Hashset");
		h.add(70.75);
		System.out.println(h);
		System.out.println("size is-->"+h.size());
		//no index concept
		//output is not sequential in Set Interface
		//sequential output is in Link interface
        
        //specific data //get
		//System.out.println(h.get); not possible
		
		//replace data //set // not possible
       // System.out.println(h.set(0))
		
		//data remove
		h.remove("Hashset");
		System.out.println(h);
		
		System.out.println("size is--> "+ h.size());
		
		Set s= new HashSet();
		
		List li= new ArrayList();
		
	}

}
