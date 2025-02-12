import java.util.Scanner;
import java.lang.Math;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input string:");
        String str=sc.nextLine();
        sc.close();
        long max=-1;
        String[] tokens=str.split("\\s+");
        for(String t:tokens){
            if(t.matches("\\d+")){
                if(!t.contains("9")){
                    long num=Long.parseLong(t);
                    max=Math.max(max,num);
                }
            }
        }
        System.out.println(max);
        }
}
