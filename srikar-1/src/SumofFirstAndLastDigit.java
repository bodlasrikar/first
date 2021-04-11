package execises;

public class SumofFirstAndLastDigit {
	public static void main(String[] args) {
		System.out.println(FirstAndLastDigitSum(7997));
	}
	public static int FirstAndLastDigitSum(int number) {
		if(number<=10) {
			return -1;
		}
		else {
				int lastDigit=number%10;
				int firstDigit=0;
				while(number>0) {
					firstDigit=number%10;
					number/=10;
					System.out.println(firstDigit);
			}
		int sum=lastDigit+firstDigit;
		return sum;
		}
	}
}
