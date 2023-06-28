class BuyAndSellStocks{
    
    public static int buyAndSellStocks(int arr[]){
        int maxProfit=0;
        int sellingPrice=0;
        int buyingPrice=arr[0];
        for(int i=1;i<arr.length;i++){
            sellingPrice=arr[i];
            int profit = sellingPrice-buyingPrice;
            if(profit>maxProfit)
            maxProfit=profit;
            if(sellingPrice<buyingPrice){
                buyingPrice=sellingPrice;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int arr[]={9,8,7,65};
        System.out.println(buyAndSellStocks(arr));
    }
}