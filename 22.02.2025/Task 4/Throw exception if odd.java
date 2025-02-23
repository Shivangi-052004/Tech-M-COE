package sample;

import java.util.Scanner;

public class Errorsample {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        
        if (num % 2 == 0) {
            throw new Exception("It is an odd number.");
        } else {
            System.out.println("It is even.");
        }
        sc.close();
    }
}


