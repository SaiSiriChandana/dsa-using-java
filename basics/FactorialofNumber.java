//without recursion
class FactorialofNumber{
  public static int factorialOfNum(int n){
    int fact=1;
    for(int i=n;i>1;i--){
      fact=fact*i;
    }
    return fact;
  }
    public static void main(String[] args){
      int n=5;
      System.out.println(factorialOfNum(n));//120
  }
}
//with recursion
class factorialRecursive{
  public static int factorialOfNumRec(int n){
    if (n == 0 || n == 1) { // base case
            return 1;
        }
   return n * factorialOfNumRec(n - 1);
  }
    public static void main(String[] args){
      int n=5;
      System.out.println(factorialOfNumRec(n));//120
  }
}
