package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListUse {

	public static void main(String[] args) 
	{
		ArrayList<Object> al= new ArrayList<>();
		al.add("Ahmednagar");
		al.add("123456");
		al.add("Ahmednagar");
		al.add('Z');
		al.add(null);
		al.add("1299.7f");
		al.add("Pune");
		
		System.out.print("ArrayList(al)---->");System.out.println(al);
		Object al1 = al.clone();
		System.out.print("Clone()--al1-->");System.out.println(al1);
		System.out.println(al.equals(al1));
		System.out.println(al.contains('Z'));
		System.out.println(al.size());
		System.out.println(al.remove(3));
		System.out.println(al);
		al.set(0, "Mumbai");
		System.out.println(al);
		al.add(0, "Ahmednagar");
		System.out.println(al);
		System.out.println(al.get(6));
		System.out.println(al.isEmpty());
		System.out.println(al.lastIndexOf("Ahmednagar"));
		al.remove("Ahmednagar");
		System.out.println(al);
		al.add(0, "Ahmednagar");
		System.out.println(al);
		System.out.println("--------------------for loop----------------------");
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("--------------------for each loop----------------------");
		for(Object a:al)
		{
			System.out.println(a);
		}
		
		System.out.println("--------------------iterator----------------------");
		Iterator<Object> it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("--------------------List iterator----------------------");
		ListIterator<Object> li = al.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
	}

}
