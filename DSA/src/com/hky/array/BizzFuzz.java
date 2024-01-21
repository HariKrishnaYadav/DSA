package com.hky.array;

import java.util.Scanner;

public class BizzFuzz {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Integer num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				
				System.out.println("BizzFuzz");

			} else if (i % 3 == 0) {
				System.out.println("Bizz");
			} else if (i % 5 == 0) {
				System.out.println("Fuzz");
			} else {
				System.out.println("num:" + i);
				break;
			}
		}
	}

}
