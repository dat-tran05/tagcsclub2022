import java.util.*;
import java.io.*;
<<<<<<< HEAD
import java.math.*;
=======
>>>>>>> branch 'master' of https://github.com/dat-tran05/tagcsclub2022.git

<<<<<<< HEAD
public class food extends PrintWriter {
	food() {
		super(System.out);
=======
public class food {
	public static void main(String[] datt) throws Throwable {
		Scanner sc = new Scanner(new File("src/testing/test2.dat"));
		List<Book> list = new ArrayList<>();
		while (sc.hasNextLine())
			list.add(new Book(sc.nextLine()));
		// Collections.sort(list);
		// sorts the same as the previous example
		list.sort(Comparator.comparing(Book::getAuthor).thenComparing(Comparator.comparing(Book::getGenre)));

		list.forEach(System.out::println);

		System.out.println(list);

		/*
		 * 
		 * sdfsdf
		 */

>>>>>>> branch 'master' of https://github.com/dat-tran05/tagcsclub2022.git
	}
<<<<<<< HEAD

	FastScanner sc = new FastScanner();

	public static void main(String[] nutz) throws IOException {
		food o = new food();
		o.main();
		o.flush()
=======
}

class Book {
	public String author, name, genre;

	public Book(String line) {
		String[] arr = line.split("\\*");
		name = arr[0];
		author = arr[1];
		genre = arr[2];
>>>>>>> branch 'master' of https://github.com/dat-tran05/tagcsclub2022.git
	}

<<<<<<< HEAD
	void main() {
		for (int t = sc.nextInt(); t-- > 0;) {
			println("sdf");
			printf("%f",20);
		}
=======
	public String toString() {
		return name + "*" + author + "*" + genre;
>>>>>>> branch 'master' of https://github.com/dat-tran05/tagcsclub2022.git
	}

<<<<<<< HEAD
	static class FastScanner extends PrintWriter {
		private InputStream stream;
		private byte[] buf = new byte[1 << 16];
		private int curChar, numChars;

		// standard input
		public FastScanner() {
			this(System.in, System.out);
		}

		public FastScanner(InputStream i, OutputStream o) {
			super(o);
			stream = i;
		}

		// file input
		public FastScanner(String i, String o) throws IOException {
			super(new FileWriter(o));
			stream = new FileInputStream(i);
		}

		// throws InputMismatchException() if previously detected end of file
		private int nextByte() {
			if (numChars == -1)
				throw new InputMismatchException();
			if (curChar >= numChars) {
				curChar = 0;
				try {
					numChars = stream.read(buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (numChars == -1)
					return -1; // end of file
			}
			return buf[curChar++];
		}

		// to read in entire lines, replace c <= ' '
		// with a function that checks whether c is a line break
		public String next() {
			int c;
			do {
				c = nextByte();
			} while (c <= ' ');
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = nextByte();
			} while (c > ' ');
			return res.toString();
		}

		public String nextLine() {
			int c;
			do {
				c = nextByte();
			} while (c < '\n');
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = nextByte();
			} while (c > '\n');
			return res.toString();
		}

		public int nextInt() {
			int c;
			do {
				c = nextByte();
			} while (c <= ' ');
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = nextByte();
			}
			int res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = 10 * res + c - '0';
				c = nextByte();
			} while (c > ' ');
			return res * sgn;
		}

		public long nextLong() {
			int c;
			do {
				c = nextByte();
			} while (c <= ' ');
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = nextByte();
			}
			long res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = 10 * res + c - '0';
				c = nextByte();
			} while (c > ' ');
			return res * sgn;
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}
=======
	public String getAuthor() {
		return author;
	}

	public String getGenre() {
		return genre;
>>>>>>> branch 'master' of https://github.com/dat-tran05/tagcsclub2022.git
	}
}