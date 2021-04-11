package execises;

public class MinutesToDaysAndYearsCalculator {
	public static void main(String[] args) {
		MinutesToDaysYears(3254699);
	}
	public static void MinutesToDaysYears(long minutes) {
		if(minutes<0)
		{
			System.out.println("invalid value");
		}
		long days=((minutes/60)/24);
		long years=days/365;
		days%=365;
		
		System.out.println(minutes+" minutes = " +days+"days and "+years+" years");
	}

}
