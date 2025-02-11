class Solution {
    public String addStrings(String num1, String num2) {
        int r1=num1.length()-1;
        int r2=num2.length()-1;
        int carry=0;
        StringBuilder res=new StringBuilder();
        while(r1>=0||r2>=0||carry>0){
            int d1=(r1>=0)?num1.charAt(r1)-'0':0;
             int d2=(r2>=0)?num2.charAt(r2)-'0':0;
             int sum=d1+d2+carry;
             carry=sum/10;
             res.append(sum%10);
             r1--;
             r2--;

        }
        return res.reverse().toString();
        
    }
}
