package sample;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class Student {
	public static void main(String[] args)

	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the total number of students:");
		int size = sc.nextInt();
		sc.nextLine();

		String[] students = new String[size];
		int[][] marks = new int[size][3];

		for (int i = 0; i < size; i++) {
			System.out.print("Enter student name: ");
			students[i] = sc.nextLine();
		}

		for (int i = 0; i < size; i++) {
			System.out.println("Marks for " + students[i] + ":");
			System.out.print("Enter Tamil Mark: ");
			marks[i][0] = sc.nextInt();
			System.out.print("Enter English Mark: ");
			marks[i][1] = sc.nextInt();
			System.out.print("Enter Maths Mark: ");
			marks[i][2] = sc.nextInt();
		}

		Student.methodAverage(students, marks);
		sc.close();
	}

	public static void methodAverage(String[] students, int[][] marks) {
		int avg = 0;
		int[] avgarr = new int[students.length];
		for (int i = 0; i < students.length; i++) {
			avg = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;
			avgarr[i] = avg;

		}
		System.out.println("Array: " + Arrays.toString(avgarr));

		for (int i = 0; i < avgarr.length; i++) {
			System.out.println("Avg mark of the " + students[i] + " is: " + avgarr[i]);

		}
		System.out.println("Sorted Array: " + Arrays.toString(avgarr));
	}

}


