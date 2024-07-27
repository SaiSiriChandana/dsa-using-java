public class PrintOneToN {
    int cnt=1;
    public void printNos(int N)
    {
        //Your code here
        if(cnt>N) return;
        System.out.print(cnt+" ");
        cnt++;
        printNos(N);
        
    }
}
