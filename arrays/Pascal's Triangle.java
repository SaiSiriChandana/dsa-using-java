/*Problem Statement: This problem has 3 variations. They are stated below:

Variation 1: Given row number r and column number c. Print the element at position (r, c) in Pascal’s triangle.

Variation 2: Given the row number n. Print the n-th row of Pascal’s triangle.

Variation 3: Given the number of rows n. Print the first n rows of Pascal’s triangle.*/
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int row = 0; row < numRows; row++) {
            List<Integer> rowList = new ArrayList<>();
            long ans = 1;
            rowList.add(1); // The first element is always 1.
            for (int col = 1; col <= row; col++) {
                //ans = ans * (row - col);
                //ans = ans / col;
                ans = ans * (row - col + 1) / col;
                rowList.add((int) ans);
            }

            triangle.add(rowList);
        }

        return triangle;
    }
}
/*Time Complexity: O(n2), where n = number of rows(given).
  Space Complexity: In this case, we are only using space to store the answer. That is why space complexity can still be considered as O(1).*/
