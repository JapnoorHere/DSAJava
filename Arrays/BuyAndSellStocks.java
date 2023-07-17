class BuyAndSellStocks {

    public static int buyAndSellStocks(int[] arr) {
        int maxProfit = 0;
        int profit = 0;
        int buyingPrice = 0;
        int sellingPrice = 0;
        
        for (int i = 0; i < arr.length-1; i++) {
            if(buyingPrice<arr[i]){
                sellingPrice = arr[i];
                profit = sellingPrice - buyingPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                buyingPrice = arr[i];
            }
        
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int arr[] = { 6,8,3,5,11};
        System.out.println(buyAndSellStocks(arr));
    }
}