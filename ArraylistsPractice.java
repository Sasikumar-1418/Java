package array.index;

import java.util.ArrayList;

public class ArraylistsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		ArrayList<String> fruits = new ArrayList<String>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		list.add(40);
		
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Grapes");
		
		
		System.out.println(list);
		System.out.println(fruits);
		
		System.out.println("After removal of few items:  ");
		
		fruits.remove("Orange");
		
		list.remove(Integer.valueOf(40));
		
		System.out.println(list);
		System.out.println(fruits);
		
		
		
		
	}

}
