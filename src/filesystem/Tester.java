package filesystem;

public class Tester {

	public static void main(String[] args) {

		try {
			Directory root = new ConcreteDirectory("root"); // total size 36
			Directory sub1 = new ConcreteDirectory("sub1"); // total size 9
			// Directory sub1 = new ConcreteDirectory();
			root.add(sub1);

			File<String> file11 = new TextFile("file1.1.txt", "Hello"); // size 5
			File<String> file12 = new TextFile("file1.2.txt", "Demo"); // size 4
			// File<String> file12 = new TextFile();
			sub1.add(file11);
			sub1.add(file12);

			Directory sub2 = new ConcreteDirectory("sub2"); // total size 27
			root.add(sub2);

			File<Long> file21 = new NumberFile("file2.1.number", (long) 396); // size 8
			File<Long> file22 = new NumberFile("file2.2.number", (long) 42);// size 8
			sub2.add(file21);
			sub2.add(file22);

			Directory sub21 = new ConcreteDirectory("sub2.1"); // total size 11
			sub2.add(sub21);

			File<Long> file211 = new NumberFile("file2.1.1.number", (long) 2018); // size 8
			File<String> file212 = new TextFile("file2.1.2.txt", "Bye"); // size 3
			sub21.add(file211);
			sub21.add(file212);

			System.out.println("Root folder size is " + root.getSize() + " bytes.");
			System.out.println(root);

		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}

	}
}
