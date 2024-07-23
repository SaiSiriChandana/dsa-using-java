public class PatternThirteen {
    public static void pattern13(int n){
        int num=1;
        //outer loop
        for(int i=0;i<n;i++){
            //inner loop
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num=num+1;
            }
        System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=5;
        pattern13(n);
    }
    
}
