package collection;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorUse {

	public static void main(String[] args) 
	{
		Vector<Integer> v= new Vector<>();
		v.add(1);
		v.add(11);
		v.add(12);
		v.add(99);
		v.add(5);
		v.add(10);
		v.add(7);

		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());
		System.out.println(v.elementAt(6));
		
		System.out.println("--------------------for loop----------------------");
		for(int i=0;i<=v.size()-1;i++)
		{
			System.out.println(v.get(i));
		}
		
		System.out.println("--------------------for each----------------------");
		for(Integer a:v)
		{
			System.out.println(a);
		}
		System.out.println("--------------------iteration----------------------");
		Iterator<Integer> it = v.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("--------------------iteration----------------------");
		ListIterator<Integer> li = v.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
	}

}
