package testexamples;

public class StockPicker {

    // __define-ocg__: Function to calculate the maximum profit from stock prices
    public static int stockPicker(int[] arr) {
        // If the array is null or has less than 2 elements, no profit can be made
        if (arr == null || arr.length < 2) {
            return -1;
        }

        // Initialize variables
        int minPrice = arr[0];
        int maxProfit = -1;
        int varOcg = 0; // Tracks the maximum profit on each iteration

        for (int i = 1; i < arr.length; i++) {
            // Calculate potential profit for the current price
            int potentialProfit = arr[i] - minPrice;

            // Update maxProfit and varOcg if a higher profit is found
            if (potentialProfit > maxProfit) {
                maxProfit = potentialProfit;
                varOcg = maxProfit;
            }

            // Update minPrice if the current price is lower
            if (arr[i] < minPrice) {
                minPrice = arr[i];
            }
        }

        return maxProfit > 0 ? maxProfit : -1;
    }

    public static void main(String[] args) {
        // Examples
        System.out.println(stockPicker(new int[]{12, 4, 5, 9})); // Output: 5
        System.out.println(stockPicker(new int[]{14, 20, 4, 12, 5, 11})); // Output: 8
        System.out.println(stockPicker(new int[]{44, 30, 24, 32, 35, 30, 40, 38, 15})); // Output: 16
        System.out.println(stockPicker(new int[]{10, 9, 8, 2})); // Output: -1
    }
}
