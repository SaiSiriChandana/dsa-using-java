class Solution{
    public int reverse(int x){
        int revNum=0;
        int lastDigit;
        boolean isNegative=x<0;
        x=Math.abs(x);
        if (x==Integer.MIN_VALUE){
            return 0;
        }
        while (x > 0) {
            lastDigit=x%10;
            x=x/10;
           // Check for overflow before updating revNum
            if (revNum>(Integer.MAX_VALUE-lastDigit)/10){
                return 0;
            }
            revNum=(revNum*10)+lastDigit;
        }
        return isNegative ? -revNum : revNum;
    }
}
