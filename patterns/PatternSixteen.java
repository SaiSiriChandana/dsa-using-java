public class PatternSixteen {
    public static void pattern16(int n){
        int i;
        for(i=0;i<n;i++){
            char ch=(char)((int)('A'+i));
            for(int j=0;j<=i;j++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=5;
        pattern16(n);
    }
    
}
