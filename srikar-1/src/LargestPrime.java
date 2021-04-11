package execises;

public class LargestPrime {
	public static void main(String[] args) {
		System.out.println(getLargestPrime(12));
	}
    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }
        for (int i = 2; i < number; i++) {
            while (number % i == 0) {
                number = number / i;
                if (number == 2) {
                    i++;
                }
            }
        }
        return number;
    }
}

