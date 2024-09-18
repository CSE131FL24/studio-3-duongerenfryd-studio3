package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What number would you like to start at? n = ");
		int n = in.nextInt();
		boolean[] sieve = new boolean[n];
		for (int i = 0; i<= sieve.length-1; i++) {
			sieve[i] = true;
		}
		for (int i = 2; i<= sieve.length; i++) {
			for (int j = i*2; j<= sieve.length; j+=i) {
			sieve[j] = false;
		} }
	 for (int i = 2; i<=sieve.length; i++) {
			if (sieve[i]=true) {
				System.out.println(i);
			}
		}
	}
}
