package execises;

public class EvenDigitSum {
	public static void main(String[] args) {
		System.out.println(evenDigitSum(4568));
	}
	public static int evenDigitSum(int number) {
		if(number<0) {
			return -1;
		}
		int sum=0;
		int even=0;
		while(number>0) {
			even=number%10;
			if(even%2==0) {
			sum+=even;
			}
			number/=10;
		}
		return sum;	
	}
}
