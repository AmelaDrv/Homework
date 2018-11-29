package computer;

public class TestComputer {

	public static void main(String[] args) {
		Computer mac = new Computer ("Apple", 1300, "Superior");
		Computer asus = new Computer ("Windows", 800, "Excellent");
		
		Computer macBrowser = new Computer ("Safari", true);
		Computer asusBrowser = new Computer ("IE", false);
	
		mac.compPrice();
		System.out.println("My computer is an " + mac.getBrand() + " and it is " + mac.getQuality());
		System.out.println("Currently it costs " + mac.getPrice());
		System.out.println("Mac's browser " + macBrowser.getDefaultBrowser() + " is the best options for developers: " + macBrowser.getReviews());
		
		mac.expiration();
		
		
		asus.compPrice();
		System.out.println("My computer is a " + asus.getBrand() + " and it is " + asus.getQuality());
		System.out.println("Currently it costs " + asus.getPrice());
		System.out.println("Asus' browser " + asusBrowser.getDefaultBrowser() + " is the best options for developers: " + asusBrowser.getReviews());
		asus.expiration();
		
		Computer.numberMacInClass();
		
	}		
}