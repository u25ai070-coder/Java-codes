package Lab_7;

public class BookInfo 
{
	private int Prize;
	private String Id;
	private String Author;
	
	
	void getAuthor() 
	{
		System.out.println("Author\t:\t"+Author) ;
	}
	void setAuthor(String author) 
	{
		Author = author;
	}
	void getPrize() 
	{
		System.out.println("Prize\t:\t"+Prize) ;
	}
	void setPrize(int prize) 
	{
		Prize = prize;
	}
	void getId() 
	{
		System.out.println("ID\t:\t"+Id) ;
	}
	void setId(String id) 
	{
		Id = id;
	}
	
	
}
