
public class Exercise19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Armstrong numbers from 1 to 100:");
	        for (int i = 1; i <= 100; i++) {
	            if (isArmstrong(i)) {
	                System.out.println(i);
	            }
	        }
	    }

	    // Function to check if a number is Armstrong or not
	    public static boolean isArmstrong(int num) {
	        int originalNum, remainder, result = 0, n = 0;
	        originalNum = num;

	        // Count number of digits
	        while (originalNum != 0) {
	            originalNum /= 10;
	            ++n;
	        }

	        originalNum = num;

	        // Calculate Armstrong number
	        while (originalNum != 0) {
	            remainder = originalNum % 10;
	            result += Math.pow(remainder, n);
	            originalNum /= 10;
	        }

	        // Check if num is equal to the result
	        return result == num;
	    }

	}


