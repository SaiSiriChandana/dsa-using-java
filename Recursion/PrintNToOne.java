public class PrintNToOne {
    void printNos(int N) {
        // code here
        if (N < 1) return;
        
        // Print the current value of N
        System.out.print(N + " ");
        
        // Recursively call printNos with N-1
        printNos(N - 1);
    }
}
