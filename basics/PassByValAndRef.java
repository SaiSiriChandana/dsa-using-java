class PassByValAndRef {
    
    static int[] passedBy(int a, int b) {
        // code here
        a=a+1;
        b=b+2;
        return new int[]{a, b};
    }
}