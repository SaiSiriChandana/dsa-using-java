//Print from N to 1
public class Solution {
    void printNos(int i,int N) {
        // code here
        if (i<1) return;
        
        // Print the current value of N
        System.out.print(i + " ");
        
        // Recursively call printNos with N-1
        printNos(i-1,N);
    }
     public static void main(String[] args) {
        Solution s = new Solution();
        s.printNos(4, 4);  // prints 4 3 2 1
    }
}
//Print from N to 1(Backtracking)
public class Solution {
    void printNos(int i, int N) {
        if (i > N) return;

        printNos(i + 1, N);
        System.out.print(i + " ");
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.printNos(1, 4);  // prints 4 3 2 1
    }
}


