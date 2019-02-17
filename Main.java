
public class Main {

	public static void main(String[] args) {
		Book b1 = new Book("Harry Potter", "JK Rowling", 2003);
		b1.setTitle("Harry Potter and the Order of the Phoenix");
		b1.setAuthor("J.K. Rowling");
		
		Dictionary d1 = new Dictionary("Dictionary", "Merriam-Webster", 2015, 171000);
		d1.setWordCount(171500);
		d1.setTitle("The Dictionary");
		
		System.out.println(b1);
		System.out.println("");
		System.out.println(d1);
		
		
	}
}
