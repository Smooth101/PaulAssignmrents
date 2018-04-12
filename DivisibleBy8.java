package get.paid.by.standardbank.to.paul.java.assignments;

import java.util.Scanner;

public class DivisibleBy8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//int enteredNumber = scan.nextInt();
		
		
		// System.out.println(divisibleBy8(enteredNumber));
		
	
		
		scan.close();
		
		run();;
	}
	
	private static int divisibleBy8(int number){
		final int DIVIDE_BY_EIGHT = 8;

		if(number % DIVIDE_BY_EIGHT == 0)
			return 1;
		else
			return -1;
		
	}
	
	public static void run()
    {
        for (int i = 1; i <= 100; i++)
        {
        	boolean num = ((i % 6 == 0) != (i % 7 == 0));             //42 is divisible       84 is divisible

            if (num == true)
            System.out.println(i + " is divisible");
        }
    }
}
