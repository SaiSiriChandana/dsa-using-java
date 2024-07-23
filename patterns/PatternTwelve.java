public class PatternTwelve {
public static void pattern11(int n){
    int space=2*(n-1);
    //outer loop
    for(int i=0;i<n;i++){
        //inner loop
        //for numbers before spaces
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        //for spaces
        for(int j=0;j<space;j++){
            System.out.print(" ");
        }
        //for numbers after spaces
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
    System.out.println();
    space=space-2;
    }
}
public static void main(String[] args) {
    int n=5;
    pattern11(n);
}
    
}
