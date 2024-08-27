
public class Book {
	private String name;
	private Author author;
	private double price;
	private int qtyInStock;
	
	//creating the constructor for Book class
	public Book(String name, Author author, double price, int qtyInStock) {
		// TODO Auto-generated constructor stub
		this.author=author;
		this.name=name;
		this.price=price;
		this.qtyInStock=qtyInStock;
	}
	//using public getters
	public String getName() {
		return name;
	}
	public Author getAuthor(){
		return author;
	}
	public double getprice() {
		return price;
	}
	public int getQtyInStock() {
		return qtyInStock;
	}
	//using public setters
	public void setName(String name) {
		this.name=name;
	}
	public void setAuthor(Author author) {
		this.author=author;
	}
	public void setprice(double price) {
		this.price=price;
	}
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock=qtyInStock;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author author =new Author("Abhi","abhi@gmail.com",'m');
		Book book = new Book("Harry Potter",author,1700,05);
		System.out.println("----The author details are----");
		System.out.println(author.getName());
		System.out.println(author.getEmail());
		System.out.println(author.getGender());
		System.out.println("__________________________________________");
		System.out.println("----The book details are----");
		System.out.println(book.getName());
		System.out.println(book.getAuthor().getName());
		System.out.println(book.getprice());
		System.out.println(book.getQtyInStock());
	}

}
