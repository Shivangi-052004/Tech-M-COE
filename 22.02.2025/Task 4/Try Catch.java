package sample;

import java.util.Scanner;

public class Try_Catch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) { // Start from 1 to avoid division by zero
            try {
                int div = num / i;
                System.out.println(div);
            } catch (ArithmeticException e) {
                System.out.println("Division by zero is not allowed.");
            }
        }
        sc.close();
    }
}
