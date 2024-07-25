import java.util.Scanner;
public class WhileLoopExample{
    public static void printReverseTable(int n){
        int i=10;
        while(i>0){
            System.out.print(n*i+" ");
            i--;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printReverseTable(n);
        sc.close();
    }
}