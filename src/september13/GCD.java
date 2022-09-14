package september13;

public final class GCD {

	/** This is the Euclidean algorithm, in its most efficient form. This is the one you should know from memory. */
	public static int gcd(int a, int b) {
		while(b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		//ugly version of the loop above: for(int temp; b != 0; temp = a % b, a = b, b = temp);
		return a;
	}
	/**Recursive Version of Euclidean Algorithm. This is the same as the top method. */
	public static int gcd4(int a, int b)
	{
		if(b == 0)
			return a;
		return gcd(b, a%b);
	}
	/** This is The Euclidean algorithm as Euclid originally proposed it. Given the identity we talked about in the
	 * meeting (gcd(a,b) = gcd(a-b,b) for a>b), this one is probably easier to understand than the one above. Once you
	 * understand this one, try and see why this one and the one above are really doing the same thing.*/
	public static int gcd2(int a, int b) {
		while(a != b) {
			if(a > b)
				a = a - b;
			else
				b = b - a;
		}
		return a;
	}
	

}