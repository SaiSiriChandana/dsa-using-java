public class PatternTwenty {
    public static void pattern20(int n){
        int spaces=2*n-2;
        //outer loop
        for(int i=1;i<=2*n-1;i++){
            //inner loop
            //for stars before spaces
            int stars = i;
            if(i>n) stars=2*n-i;
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            //for spaces
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            //for stars after spaces
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
            if(i<n) spaces-=2;
            else spaces+=2;
            
        }
    }
    public static void main(String[] args){
        int n=5;
        pattern20(n);
    }
    
}

    
