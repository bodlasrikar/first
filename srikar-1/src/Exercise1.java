package execises;

public class Exercise1 
{
	public static void main(String[] args) {
		checkNumber(5);
		checkNumber(-8);
		checkNumber(0);
	}
	public static void checkNumber(int number) {
		if(number>0)
		{
			System.out.println("Number is Positive");
		}
		else if(number<0)
		{
			System.out.println("Number is negative");
		}
		else {
			System.out.println("zero");
		}
	}
}
