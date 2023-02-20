import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        int N = sc.nextInt();

        // printing fibonacci series using printFibSeries() method of FibonacciSeries class
        FibonacciSeries.printFibSeries(N);

        // clsoing resource
        sc.close();
    }
}