package selenium1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class Collections 
{
public static void main(String[] args) 
{
	ArrayList x= new ArrayList();
	
	x.add(10); //0
	x.add(20); //1
	x.add("mock5");
	x.add(20.50);
	x.add('a');
	
	System.out.println(x);
    System.out.println(x.get(3));
	System.out.println(x.get(1));
	
	int m= (int)x.get(0);
	int n= (int)x.get(1);
	System.out.println(m+n); //10+20
	
	//replace the data
	//set method
//	x.set(2,"morning batch");
//	System.out.println(x);
    System.out.println(x.set(2,"TesTing"));
	
	//remove the data
	//remove method
	x.remove(4);
	System.out.println(x);
	
	//how much data available 
	//size method
	
	System.out.println(x.size());
	x.add(100);
	System.out.println(x);
	System.out.println("new size is " + x.size());
	
	//specific data type arraylist
	ArrayList<Integer> y = new ArrayList<Integer>();
	
	y.add(10);
	y.add(20);
	//y.add("harish"); not possible
	
	//-----------------------------------------------//
	LinkedList a= new LinkedList();
	a.add(10);
	a.add('z');
	a.add("Velocity");
	a.add(12.50);
	System.out.println(a);
	System.out.println(a.get(0));
	a.set(2,"abc");
	System.out.println(a);
	//------------------------------------------//
	
	System.out.println("vector class");
	//vector class
	Vector v= new Vector();
	v.add(50);
	v.add("iginte");
	
	System.out.println(v);
	//------------------------------------------------//
	
	System.out.println("stack class");
	Stack s= new Stack();
	s.add(50);
	s.add(70);
    
	int p= (int)s.get(0);
	int q= (int)s.get(1);
	System.out.println(s);
	
	//----------------------------------------------//
	System.out.println("ListClass");
	//List-->interface
	//ArrayList class

	
	List l= new ArrayList();
    l.add(5);
    l.add("harsh");
    l.add('s');
    System.out.println(l);
    l.remove(2);
    System.out.println(l);
    
    //-------------------------------------------//
 
    List c= new LinkedList();
    
    List d= new Vector();
    
    List e= new ArrayList();
    
    System.out.println("Deque");
    Deque f= new ArrayDeque();
    
    System.out.println("Queue");
	Queue g= new PriorityQueue();
	
	
	
	
	
	
    
	
	

   
   

}
    
}
