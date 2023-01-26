package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What year is a leap year?");
		int name = in.nextInt();
		boolean leap = true;
		leap = ((name % 4 == 0 )&&(name % 100 != 0)|| (name % 400 == 0));
		System.out.println(leap);
	}

}
