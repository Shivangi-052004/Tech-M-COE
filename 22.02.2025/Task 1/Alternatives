package sample;
import java.util.Arrays;
import java.util.Scanner;
public class Prgm1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) 
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array: " + Arrays.toString(arr));

            int[] ar1 = new int[size / 2];
            for (int i = 0; i < size / 2; i++)
            {
                ar1[i] = arr[2 * i + 1]; // Storing alternate elements
            }
            System.out.println("Alternate Elements Array: " + Arrays.toString(ar1));


        sc.close();
    }
}
