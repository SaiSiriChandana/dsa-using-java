public class SumOfNTerms {
    //Given an integer n, calculate the sum of series 13 + 23 + 33 + 43 + … till n-th term.
    long sumOfSeries(long n) {
        // code here
        if(n==0){
            return 0;
        }
        return n*n*n+sumOfSeries(n-1);
    }
    
}
