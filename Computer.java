package computer;

public class Computer {
	
	String brand;
	int price;
	String quality;
	
	String defaultBrowser; 
	boolean reviews;
	
	int inflation = 50;
	static int warranty = 3;
	static int appleComp = 25;
	
	public Computer(String brand, int price, String quality) {
		this.brand = brand;
		this.price = price;
		this.quality = quality;
		}
	
	public Computer(String defaultBrowser, boolean reviews) {
		this.defaultBrowser = defaultBrowser;
		this.reviews = reviews;	
	}
	
	public int getPrice() {
		return price;
	}
	public String getQuality() {
		return quality;
	}
	public boolean getReviews() {
		return reviews;
	}
	public String getDefaultBrowser() {
		return defaultBrowser;
	}
	public String getBrand() {

		return brand;
	}
	
	public int getInflation() {

		return inflation;
	}
	
	public int compPrice() {
		return price = price + inflation;
	}
	
	public static void numberMacInClass() {
		System.out.println("Only "+ appleComp + " people use Mac in our class" );
	}
	public void expiration() {
		System.out.println(brand + " warranty is for " + warranty + " years" );;
	}
}
