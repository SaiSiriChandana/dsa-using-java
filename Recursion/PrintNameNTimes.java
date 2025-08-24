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
 public class Solution {
    void printGfg(int i, int N) {
        if(i > N) return;          // base case
        System.out.print("GFG" + " ");
        printGfg(i+1, N);          // recursive call
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.printGfg(1, 5);  // prints GFG GFG GFG GFG GFG
    }
}
This is cleaner because it doesn’t depend on an external variable; instead, recursion handles the i.(parameterized recursion)
*/

