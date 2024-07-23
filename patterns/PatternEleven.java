public class PatternEleven {
    public static void pattern11(int n){
        int start=1;
        for(int i=0;i<n;i++){
            if(i%2==0) start=1;
            else start=0;
            //inner loop
            for(int j=0;j<=i;j++){
                System.out.print(start);
                start=1-start;//to flip start from 0 to 1 and 1 to 0
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=5;
        pattern11(n);
    }
}
