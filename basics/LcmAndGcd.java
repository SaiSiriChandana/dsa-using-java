public class LcmAndGcd{
public static Long[] lcmAndGcd(Long A , Long B) {
    // code here
     // Find GCD using the Euclidean algorithm
    long gcd = findGcd(A, B);
    
    //LCM * GCD = A * B
    long lcm = (A * B) / gcd;
    
    // Return the result as an array of Longs
    return new Long[]{lcm, gcd};
    
}
static long findGcd(Long A,Long B){
    while(A>0&&B>0){
        if(A>B) A=A%B;
        else B=B%A;
    }
    if(A==0) return B;
    else return A;
}
}

