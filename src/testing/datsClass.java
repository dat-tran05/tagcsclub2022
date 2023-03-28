package testing;

<<<<<<< HEAD
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.*;
=======
>>>>>>> branch 'master' of https://github.com/dat-tran05/tagcsclub2022.git
import java.util.*;

public class datsClass {
	public static void main(String[] args) {
<<<<<<< HEAD
//		List<Apple> list = new ArrayList<>();
//		for(int i =0 ; i < 10; i++) {
//			list.add(new Apple());
//		}
		long longer = (System.currentTimeMillis());
		var a1 = new A();
		var b = "sdf";
		var  c1 = 1;
		var a23234 = new int[]{1,2,3,4};
		System.out.println(Arrays.toString(a23234));
		var sixty = new Stack<String>();
		sixty.push("dfs");
		System.out.println(sixty);
		sixty = new Stack<String>();
//		Apple a = list.get(0);
//		System.out.println(a.total);
		Consumer<String> c = (n) -> System.out.println(n);
//		BiConsumer<String,String> bc = (d,b) -> System.out.println(d+"\n" + b);
		Predicate<Integer> p = (s) -> {
			 return s ==1 ;
			 
		};
		List<String> list2 = Arrays.asList("sdf", "sdfs","sdfs");
		list2.forEach(System.out::println);
		c.accept("sdf");
		
		for(;c1 < 1000;) {
			System.out.println(c1++);
=======
		Stack<String> stack = new Stack<>();
		System.out.println('d');
		for (int i = 0; i < args.length; i++) {
			stack.add("'s");
>>>>>>> branch 'master' of https://github.com/dat-tran05/tagcsclub2022.git
		}
		System.out.println(longer);
		System.out.println((System.currentTimeMillis()-longer)/1000.0);

//		bc.accept("apple", "banana");
//		System.out.println(\);
	}
}
class A{
	public static int total;	
	public A() {
		total++;
	}
}