import java.util.List;
public class Solution {
    static double switchCase(int choice, List<Double> arr){
        // code here
        switch(choice){
            case 1:
                double r=arr.get(0);
                return Math.PI*r*r;
                
                
            case 2:
                double l=arr.get(0);
                double b=arr.get(1);
                return l*b;
            
                
            default:
            //System.out.println("invalid");
            return -1;
        }
    
    }
}
    

