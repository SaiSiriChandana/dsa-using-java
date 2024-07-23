public class Patternten {
    public static void pattern10(int n){
        //outer loop
        for(int i=1;i<=2*n-1;i++){
            int stars=i;
            //inner loop
            if (i>n) stars=2*n-i;
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=5;
        pattern10(n);
    }
}

