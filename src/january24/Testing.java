package january24;

import java.util.Arrays;
import java.util.*;
public class Testing extends Object implements B{
	public static void main(String[] args) {
		List<Integer> list1 = List.of(1,2,3,4);	
		List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4));
		System.out.println(list1 + "    " + list2);
//		list1.add(23);
		list1 = list2;
		list2.add(32);
		System.out.println(list1 + "    " + list2);
		int a1 = 234;
		A interf = (final a, final b) -> a + b + a1;
		System.out.println(yuh(1200));
		
		Polygon p1 = new Polygon() {
	         public void display() {
	            System.out.println("Inside an anonymous class.");
	         }
	      };
		
	}
	public static int yuh(int g) {
		A interf = (a,b) -> a + b + g;
		return interf.add(123, 234);
	}
}
class Polygon {
	   public void display() {
	      System.out.println("Inside the Polygon class");
	   }
	}
interface B {
	default void click() {
		
	}
}
interface A{
	int add(int a, int b);
}