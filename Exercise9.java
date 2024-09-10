import java.util.Scanner;

public class Exercise9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	        System.out.print("Enter a year: ");
	        int year = in.nextInt();
	        
	        if(isLeapYear(year)) {
	            System.out.println(year + " is a leap year.");
	        } else {
	            System.out.println(year + " is not a leap year.");
	        }
	       
	    }
	    
	    public static boolean isLeapYear(int year) {
	        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
	            return true;
	        } else {
	            return false;
	        }
	    }
		
		

	}


