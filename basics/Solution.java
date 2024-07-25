import java.util.Scanner;
public class Solution{
    public static int FindNthFibNum(int n){
        if(n<0){
            return -1;//invalid input.fib num is not defined for neg nos.
        }
        int a=0,b=1,c;
        if(n==0){
            return a;
        }
        else if(n==1||n==2){
            return 1;
        }
        for(int i=2;i<=n;i++){
            c = a + b;
            a = b;
            b = c;

        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(FindNthFibNum(num));
        sc.close();
    }

}