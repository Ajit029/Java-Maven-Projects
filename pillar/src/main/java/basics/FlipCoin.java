package basics;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
		int n = getInput();
		simulateFlip(n);
	} // end main

	private static int getInput() {
		Scanner in = new Scanner(System.in);
		System.out.println("How many times to flip the coin?");
		int n = in.nextInt();
		in.close();
		return n;
	}
	private static void simulateFlip(int n) {
		int heads = 0;
		int tails = 0;
		for (int i = 1; i <= n; i++) {
			System.out.print("f(" + i + "): ");
			if (Math.random() < .5) {
				System.out.println("heads");
				heads++;
			} else {
				System.out.println("tails");
				tails++;
			}
		} // end for

		System.out.println("\nStatistics: ");
		System.out.println("Heads: " + 100 * heads / n + "%" );
		System.out.println("Tails: " + 100 * tails / n + "%");
	}
    
}
