class PatternEight{
    public static void pattern8(int n){
        //outer loop
        for(int i=0;i<n;i++){
            //inner loop
            //for space before stars
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            //for stars
            for(int j=0;j<2*n-(2*i+1);j++){
                System.out.print("*");
            }
            //for space after stars
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=5;
        pattern8(n);
    }
}