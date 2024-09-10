import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		char opt;
		Scanner sc = new Scanner(System.in);
		System.out.println("Menu: ");
		System.out.println(" press + ");
		System.out.println(" - ");
		System.out.println(" * ");
        System.out.println(" / ");
        System.out.println(" % ");
        System.out.println("Enter the first number: ");
        a = sc.nextInt();
        System.out.println("Enter second number: ");
        b = sc.nextInt();
        System.out.println("Enter your choice: ");
        opt = sc.next().charAt(0);
        switch (opt)
        {
        case '+':
        c = a + b;
        System.out.println(c);
        break;
        case '-':
        c = a - b;
        System.out.println(c);
        break;
        case '*':
        c = a * b;
        System.out.println(c);
        break;
        case '/':
        c = a + b;
        System.out.println(c);
        break;
        case '%':
        c = a + b;
        System.out.println(c);
        break;
        default:
        	System.out.println("Wrong choice");
        
        }

	}

}
