public class Solution {
        static int evenlyDivides(int N){
            // code here
            int originalNum=N;
            int lastDig;
            int count=0;
            while(N>0){
                lastDig=N%10;
                N=N/10;
                if(lastDig!=0&&originalNum%lastDig==0)
                count++;
            }
            return count;
        }
        
    }

