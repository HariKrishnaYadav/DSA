package hky.practice;

import java.util.Scanner;

public class ProductSumDivisible {
    private static boolean isDivisible(int n) {
        int product = 1, sum = 0;
        for (int i = 1; i <= n; i++) {
            product *= i;
            sum += i;
        }
        return (product % sum == 0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isDivisible(n)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }


}
