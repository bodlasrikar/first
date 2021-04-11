package execises;

public class Main {
	public static void main(String[] args) {
		long miles=SpeedConverter.toMilesPerHour(10.5);
		System.out.println(miles);
		
		SpeedConverter.printConversion(10.5);
		
		boolean barks=BarkingDog.main(true,9);
		System.out.println("NEED TO WAKE UP="+barks);
		
		boolean y=LeapYear.isLeapYear(2004);
		System.out.println("the enered year is a leap year = " + y);
		
		boolean d=DecimalComparator.areEqualByThreeDecimalPlaces(2,3.1213);
		System.out.println(d);
		
	}
}
