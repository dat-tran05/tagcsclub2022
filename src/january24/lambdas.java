package january24;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class lambdas {
	public static void main(String[] args) {
		String[] s = "sdf".repeat(5000230).split("");
		List<String> temp = Arrays.asList(s);
		List<String> list = Arrays.asList(s);
		Long time = System.currentTimeMillis();
//		int i = 0;
		list.forEach(n ->{
			if(n.equals("s")) {
				temp.remove(n);
			}
		});
		System.out.println(System.currentTimeMillis() - time);
		time = System.currentTimeMillis();
		for(int i = temp.size()- 1 ; i>=0 ; i--) {
			if(temp.get(i).equals("s"))
				temp.remove(temp.get(i));
		}
		System.out.println(-time + System.currentTimeMillis());
	}
	
//	public void display() {
//		
//	}
}

interface Gender{
	<T> void display();
}
interface printing{
	static int a = 563;
	double display(double a, double b);
}