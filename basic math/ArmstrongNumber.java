import java.lang.Math;
import java.util.Scanner;
public class ArmstrongNumber{
    public static boolean armstrong(int n){
        int sum=0;
        int ld;
        int dup=n;
        int cntDig=String.valueOf(n).length();
        while(n>0){
            ld=n%10;
            sum=sum+(int)Math.pow(ld,cntDig);
            n=n/10;
        }
        return(sum==dup)?true:false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(armstrong(n));
        sc.close();
    }
}
                            
                        
