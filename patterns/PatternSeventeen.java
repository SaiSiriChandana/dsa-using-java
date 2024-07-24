public class PatternSeventeen {
    public static void pattern17(int n){
        //outer loop
        for(int i=0;i<n;i++){
            //for spaces before characters
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //for characters
            char ch='A';
            int breakpoint = (2*i+1)/2;
            for(int j=1;j<=2*i+1;j++){
                System.out.print(ch);
                if(j<=breakpoint) ch++;
                else ch--;
            }
            //for spaces after characters
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n=5;
        pattern17(n);
    }
    }
    
    

