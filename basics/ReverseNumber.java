class ReverseNumber {
    public int reverse(int x) {
        int revNum = 0;
        int lastDigit;
       

        // Handle the special case for Integer.MIN_VALUE
        if (x == Integer.MIN_VALUE) {
            return 0;
        }
        boolean isNegative = x < 0;

        x = Math.abs(x);

        while (x > 0) {
            lastDigit = x % 10;
            x = x / 10;
            
            // Check for overflow before updating revNum
            if (revNum > (Integer.MAX_VALUE - lastDigit) / 10) {
                return 0; // Overflow occurred
            }

            revNum = (revNum * 10) + lastDigit;
        }

        return isNegative ? -revNum : revNum;
    }

    public static void main(String[] args) {
        ReverseNumber solution = new ReverseNumber();
        System.out.println(solution.reverse(-123)); // Should print -321
        System.out.println(solution.reverse(2147483647)); // Should print 0 due to overflow
    }
}

    
