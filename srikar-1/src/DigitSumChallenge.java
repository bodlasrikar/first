package execises;

	public class DigitSumChallenge {
    public static boolean isOdd (int number) {
        if (number < 0) {
            return false;
        }
        if (number % 2 == 1) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public static int sumOdd (int start, int end) {
        int sum = 0;
        if ((start <= end) && (start > 0) && (end > 0)) {
                for (int i = start; i <= end; i++) {
                    if (isOdd(i) == true) {
                        sum += i;
                    }
                }
            }
        else {
            return -1;        
        }
        return sum;
    }

}

