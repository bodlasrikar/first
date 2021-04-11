package execises;

public class SharedDigit {
	public static void main(String[] args) {
		System.out.println(sharedDigit(18,39));
	}
	public static boolean sharedDigit(int num1,int num2) {
		if(num1<10||num1>99||num2<10||num2>99) {
			return false;
		}
		int compare1;
		int compare2;
		while(num1>0) {
			compare1=num1%10;
			num1/=10;
			int originalNum2=num2;
			while(originalNum2>0) {
				compare2=originalNum2%10;
				originalNum2/=10;
				if(compare1==compare2) {
					return true;
				}
			}
			
		}
		return false;
	}
	

}
