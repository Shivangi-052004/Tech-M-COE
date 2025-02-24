public class FileReaderExample {
    public static void main(String[] args) {
        // 1. Hello, Java! Thread
        new HelloThread().start();
        
        // 2. Even and Odd numbers using threads
        Thread evenThread = new Thread(new EvenOddThread(2, 20), "Even Thread");
        Thread oddThread = new Thread(new EvenOddThread(1, 19), "Odd Thread");
        evenThread.start();
        oddThread.start();
        
        // 3. Sort array using multiple threads
        int[] array = {5, 3, 8, 1, 2};
        new SortArrayThread(array).start();
        
        // 4. Matrix Multiplication using multiple threads
        int[][] A = {{1, 2}, {3, 4}};
        int[][] B = {{2, 0}, {1, 2}};
        int[][] C = new int[2][2];
        Thread[][] threads = new Thread[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                threads[i][j] = new MatrixMultiplicationThread(A, B, C, i, j, 2);
                threads[i][j].start();
            }
        }
        
        // 5. Sum of prime numbers using multiple threads
        PrimeSumThread primeThread1 = new PrimeSumThread(1, 50);
        PrimeSumThread primeThread2 = new PrimeSumThread(51, 100);
        primeThread1.start();
        primeThread2.start();
    }
}
