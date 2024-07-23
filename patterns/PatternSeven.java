public class PatternSeven {
    public static void pattern7(int n){
    //outer loop
    for(int i=0;i<n;i++){
        //for spaces before stars
        for(int j=0;j<n-i-1;j++){
            System.out.print(" ");
        }
        //for stars
        for(int j=0;j<2*i+1;j++){
            System.out.print("*");
        }
        //for spaces after stars
        for(int j=0;j<n-i-1;j++){
            System.out.print(" ");
        }
        System.out.println();
    }
}
public static void main(String[] args){
    int n=5;
    pattern7(n);
}
}
