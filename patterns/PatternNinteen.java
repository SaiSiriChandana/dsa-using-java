public class PatternNinteen {
    public static void pattern19(int n){
        int initialSpace = 0;
        // upper half of pattern
        for(int i=0;i<n;i++){
            //for stars before spaces
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            //for spaces
            for(int j=0;j<initialSpace;j++){
                System.out.print(" ");
            }
            //for stars after spaces
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            initialSpace+=2;
            System.out.println();

        }
        //lower half of pattern
        initialSpace = 2*n-2;
        for(int i=1;i<=n;i++){
            //for stars before spaces
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //for spaces
            for(int j=0;j<initialSpace;j++){
                System.out.print(" ");
            }
            //for stars after spaces
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            initialSpace-=2;
            System.out.println();

        }
    }
    public static void main(String[] args) {
        int n=5;
        pattern19(n);
    }
    
}
