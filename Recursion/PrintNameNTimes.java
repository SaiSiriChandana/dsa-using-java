public class PrintNameNTimes {
        int i=1;
        void printGfg(int N) {
            // code here
            if(i>N) return;
            System.out.print("GFG"+" ");
            i++;
            printGfg(N);
            
        }
    }
