package inheritance.model;

public abstract class Thing implements DoesStuff
{
	private String words;
	
	public String getWords()
	{
		return words;
	}
	
	public void setWords(String notWords)
	{
		this.words = notWords;
	}
	
	public void doesNada()
	{
		System.out.println("asdfasdfasdfasdfasdfasdfasdf"+ words);
	}
}
