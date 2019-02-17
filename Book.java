
public class Book {
	private String title, author;
	private int copyrightYear;
	public int date;
	
	public Book(String title, String author, int copyrightYear) {
	this.title = title;
	this.author = author;
	this.copyrightYear = copyrightYear;
	}
	public String getTitle() {
	return title;
	}
	public String getAuthor() {
	return author;
	}
	public int getCopyrightYear() {
	return copyrightYear;
	}
	public void setAuthor(String author) {
	this.author = author;
	}
	public void setTitle(String title) {
	this.title = title;
	}
	public void setCopyrightYear(int copyrightYear) {
	if(copyrightYear > 0) {
	this.copyrightYear = copyrightYear;
	}
	}
	@Override
	public String toString() {
	return title + " by " + author + " (" + copyrightYear + ")";
	}
	
	@Override
	public boolean equals (Object obj)
	{
		if (obj instanceof Book)
		{
			Book book = (Book) obj;
			return this.title.equalsIgnoreCase(book.title)
					&& this.author.equalsIgnoreCase(book.author)
					&& this.copyrightYear == book.copyrightYear;
		}
		else
		{
			return false;
		}
	}
}
