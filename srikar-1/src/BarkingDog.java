package execises;

public class BarkingDog {
	
	public static boolean main(boolean dogBarking,int hour) {
		
		if(dogBarking && (hour<8 || hour>22)) {
			return true;
		}
	return false;

	}
}