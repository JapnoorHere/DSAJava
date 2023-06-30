class BuyAndSellStocks {

    public static int buyAndSellStocks(int[] arr) {
        int maxProfit = 0;
        int profit = 0;
        int buyingPrice = 0;
        int sellingPrice = 0;
        
        for (int i = 0; i < arr.length-1; i++) {
            buyingPrice = arr[i];
            if (arr[i+1] > buyingPrice) {
                sellingPrice = arr[i+1];
            }
            profit = sellingPrice - buyingPrice;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int arr[] = { 6,8,3,5,11 };
        System.out.println(buyAndSellStocks(arr));
    }
}