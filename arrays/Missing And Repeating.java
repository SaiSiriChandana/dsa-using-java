class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int xr=0;
        for(int i=0;i<n;i++){
            xr=xr^arr[i];
            xr=xr^(i+1);
        }
        int number = (xr & ~(xr - 1));
        int zero = 0;
        int one = 0;
        for (int i = 0; i < n; i++) {
            //part of 1 group
            if ((arr[i] & number) != 0) {
                one = one ^ arr[i];
            }
            //part of 0 group
            else {
                zero = zero ^ arr[i];
            }
        }

        for (int i = 1; i <= n; i++) {
            //part of 1 group
            if ((i & number) != 0) {
                one = one ^ i;
            }
            //part of 0 group
            else {
                zero = zero ^ i;
            }
        }

        // Lastly Identify the numbers
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == zero) cnt++;
        }

        if (cnt == 2) return new int[] {zero, one};
        return new int[] {one, zero};

    }
}
