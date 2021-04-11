package execises;

public class DayOfTheWeekChallenge {
	public static void main(String[] args) {
		printDayOfTheWeek(4);
		printDayOfTheWeek(9);

	}
	public static void printDayOfTheWeek(int day) {
		switch(day) {
		case 0:System.out.println("sunday");break;
		case 1:System.out.println("Monday");break;
		case 2:System.out.println("tuesday");break;
		case 3:System.out.println("wednesday");break;
		case 4:System.out.println("thursday");break;
		case 5:System.out.println("friday");break;
		case 6:System.out.println("saturday");break;
		default:System.out.println("Invalid data");
		}			
	}

}
