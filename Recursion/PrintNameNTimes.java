public class Solution {
        int i=1;
        void printGfg(int N) {
            // code here
            if(i>N) return;
            System.out.print("GFG"+" ");
            i++;
            printGfg(N);
            
        }
    }

/*
 void printGfg(int i,int N) {
            // code here
            if(i>N) return;
            System.out.print("GFG"+" ");
            printGfg(i+1,N);
*/
