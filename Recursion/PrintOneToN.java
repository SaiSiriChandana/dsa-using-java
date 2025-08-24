//Print linearly from 1 to N (normal recursion)
public class Solution {
    public static void printNos(int i, int N) {
        if (i > N) return;  // base case
        System.out.print(i + " "); 
        printNos(i + 1, N); // recursive call
    }

    public static void main(String[] args) {
        int N = 4;
        printNos(1, N); // start from 1
    }
}
// Print linearly from 1 to N (using backtracking)
public class Solution {
    public static void printNos(int N) {
        if (N < 1) return;   // base case
        printNos(N - 1);     // first go down to 1
        System.out.print(N + " "); // print on the way back
    }

    public static void main(String[] args) {
        int N = 4;
        printNos(N);
    }
}


