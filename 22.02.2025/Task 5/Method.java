package sample;

import java.io.*;
import java.util.Arrays;

class HelloThread extends Thread {
    public void run() {
        System.out.println("Hello, Java!");
    }
}

class EvenOddThread implements Runnable {
    private int start, end;
    
    public EvenOddThread(int start, int end) {
        this.start = start;
        this.end = end;
    }
    
    public void run() {
        for (int i = start; i <= end; i += 2) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}

class SortArrayThread extends Thread {
    private int[] array;
    
    public SortArrayThread(int[] array) {
        this.array = array;
    }
    
    public void run() {
        Arrays.sort(array);
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }
}

class MatrixMultiplicationThread extends Thread {
    private int[][] A, B, C;
    private int row, col, size;
    
    public MatrixMultiplicationThread(int[][] A, int[][] B, int[][] C, int row, int col, int size) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.row = row;
        this.col = col;
        this.size = size;
    }
    
    public void run() {
        for (int k = 0; k < size; k++) {
            C[row][col] += A[row][k] * B[k][col];
        }
    }
}

class PrimeSumThread extends Thread {
    private int start, end;
    private long sum = 0;
    
    public PrimeSumThread(int start, int end) {
        this.start = start;
        this.end = end;
    }
    
    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    
    public void run() {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) sum += i;
        }
        System.out.println("Sum of primes from " + start + " to " + end + " is " + sum);
    }
}
