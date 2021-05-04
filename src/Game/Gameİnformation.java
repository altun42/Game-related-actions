package Game;

public class Game›nformation {
	private String name;
	private String releaseDate;
	private String details;
	private double price;
	private double discount;
	private double finalPrice  ;
	public Game›nformation() {
		
	}
	public Game›nformation(String name, String releaseDate, String details, double price,double discount) {
		super();
		this.name = name;
		this.releaseDate = releaseDate;
		this.details = details;
		this.price = price;
		this.discount=discount;
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getFinalPrice() {
		return finalPrice=price-(price*discount);
	}
	
}
