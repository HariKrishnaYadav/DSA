package com.hky.array;

import java.util.Scanner;

public class FirstAnd2ndSmallestNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();

		}
		int firstSmallest = Integer.MAX_VALUE;
		for (int i = 0; i < N; i++) {
			if (arr[i] < firstSmallest) {
				firstSmallest = arr[i];

			}
			System.out.println("firstSmallest::" + firstSmallest);
			
		}
		int secondSmallest = Integer.MAX_VALUE;
		for (int i = 0; i < N; i++) {
			if (arr[i] < firstSmallest) {
				secondSmallest = arr[i];

			}
			String fsecondSmallest = null;
			System.out.println("secondSmallest::" + fsecondSmallest);
	}
}
}