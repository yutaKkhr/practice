public class Book extends TangibleAsset {
	private String isbn;
	public Book (String name, int price, String color, String isbn){
		super(name,pricre,color);
		this.isbn = isbn;
	}
	public String getIsbn(){return this.isbn;}
}
