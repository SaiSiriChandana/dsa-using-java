class Solution {
    public static int totalFruits(Integer[] arr) {
        // code here
        int n = arr.length;
        int l = 0, r = 0, maxFruits = 0;
        Map<Integer, Integer> basket = new HashMap<>();

        while (r < n) {
            // Add the current fruit to the basket
            basket.put(arr[r], basket.getOrDefault(arr[r], 0) + 1);

            // If the basket has more than 2 types of fruits, shrink the window
            while (basket.size() > 2) {
                basket.put(arr[l], basket.get(arr[l]) - 1);
                if (basket.get(arr[l]) == 0) {
                    basket.remove(arr[l]);
                }
                l++;
            }

            // Calculate the maximum fruits picked
            maxFruits = Math.max(maxFruits, r - l + 1);
            r++;
        }

        return maxFruits;
    }
}
