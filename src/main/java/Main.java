import com.libra.polymorphism.*;

public class Main {
	public static void main(String[] args) {
		
		Aviation aviation = new Aviation();
		Aviation jet = new PrivateJet();
		Aviation chopper = new Helicopter();
		
		//What will happen here
		//System.out.println("Favorite Jet: " + jet + "\nFavorite Helicopter: " + chopper);
		
		System.out.println(aviation.aircraft() + jet.aircraft() +"\n\n"+ aviation.aircraft() + chopper.aircraft());
		}
}