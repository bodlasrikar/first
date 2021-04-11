package execises;

public class GreatestCommonDivisor {
	public static void main(String[] args) {
	System.out.println(getGCD(250,750));
}
	public static int getGCD(int num1,int num2) {
		if(num1<10||num2<10) {
			return -1;
		}
		
		int GCD=1;
//		int Onum1=num1;
//		int Onum2=num2;
		
		if(num1<num2) {
			for(int i=1;i<=num1;i++) {
				if(num1%i==0 && num2%i==0) {
					GCD=i;
				}
			}
		}
		else {
			for(int i=1;i<num2;i++) {
				if(num1%i==0 && num2%i==0) {
					GCD=i;
				}

			}
		}
	return GCD;
	}

}
