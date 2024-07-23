public class PatternFifteen {
    public static void pattern15(int n){
        //outer loop
    for(int i=0;i<n;i++){
        //inner loop
        for(char ch='A';ch<='A'+(n-i-1);ch++){
            System.out.print(ch+" ");
        }
        System.out.println();
    }
}
public static void main(String[] args) {
    int n=5;
    pattern15(n);
}
}
