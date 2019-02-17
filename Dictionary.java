
public class Dictionary extends Book
{	
	private int wordCount;
	
	
	
	// constructor
	public Dictionary(String title, String author, int copyrightYear, int wordCount)
	{
		super(title, author, copyrightYear);
		this.wordCount = wordCount;
	}
	
	// getter
	public int getWordCount()
	{
		return wordCount;
	}
	
	public void setWordCount(int wordCount)
	{
		if (wordCount > 0)
		{
			this.wordCount = wordCount;
		}
	}
	
	// toString method
	@Override
	public String toString()
	{
		String s = super.toString();
		s += "\ncontains " + wordCount + " words";
		return s;
	}
}
