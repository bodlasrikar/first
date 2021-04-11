package execises;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println(isPalindrome(919));
	}
	public static boolean isPalindrome(int number) {
		int posnumber=Math.abs(number);
		
		String num1="";
		num1+=posnumber;
		String num2="";
		
		int lastdigit=0;
		while(posnumber>0) {
			lastdigit=posnumber%10;
			posnumber/=10;
			num2+=lastdigit;
			
		}
		if(num1.equals(num2)) {
			return true;
	}
return false;
}
}
