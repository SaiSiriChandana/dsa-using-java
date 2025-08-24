class Solution{
    static long sumOfDivisors(int N){
        // code here
        long sum=0;
        for(int i=1;i<=N;i++){
                sum += (N / i) * i;
        }
        return sum;
    }
}

/* N=4
   1=1
   2=1,2=1+2=3
   3=1,3=1+3=4
   4=1,2,4=1+2+4=7
   so 1+3+4+7=15
*/
