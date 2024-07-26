public class Palindrome {
        public boolean isPalindrome(int x) {
            int lastDig;
            int duplicate=x;
            int revN=0;
            if(x<0||(x!=0&&x%10==0)){
                return false;
            }
            while(x>0){
                lastDig=x%10;
                x=x/10;
                revN=(revN*10)+lastDig;
            }
            if(duplicate==revN){
                return true;
            }
            else return false;
        }
    }

