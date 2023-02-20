public class FibonacciSeries {
    public static void printFibSeries(int N) {
        // default first terms of fibonacci series
        int firstTerm = 0, secondTerm = 1;
        
        // to store next term of series
        int thirdTerm;

        System.out.print(firstTerm + " " + secondTerm + " ");
        
        for(int i = 1; i < N-1; i++) {
            // calculating next term of series
            // as we know that next term in series can be calculated as 
            // sum of previous terms
            thirdTerm = firstTerm + secondTerm;

            System.out.print(thirdTerm + " ");
            
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
        }
    }
}