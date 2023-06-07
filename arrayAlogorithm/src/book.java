public class book {
	//instance variable
	int bookNumber;
	String bookTypes;
	String authorname;
	float price;
	
	public book()
	{
		//default constructor
	}
	public book(int bookNo,String bookType, String author,float price)
	{
		//parameterized constructor
		this.bookNumber=bookNumber;
		this.bookTypes=bookTypes;
		this.authorname=authorname;
		this.price=price;
	}
	public float getBookPrice()
	{
		return price;
	}
	
	

	public static void main(String[] args) {
		book book1=new book(1,"c++","yashwant kanetkar",300.07f);
		book book2=new book(2,"java","Herbalt shield",500.07f);
if (book1.getBookPrice()>book2.getBookPrice())
{
	System.out.println("c++ has more price than java book"+book1); 
	}
else 
{
	System.out.println("java has more price than c++ book"+book2);
}
	}

}
