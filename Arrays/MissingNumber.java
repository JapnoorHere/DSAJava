public class MissingNumber {

    public static int missing(int[] arr){
        int arrSum=0;
        int wholeSUm=0;
        for(int i=0;i<=arr.length;i++){
            if(i<arr.length)
            {
                arrSum+=arr[i];
            }
            
            wholeSUm+=i+1;
        }
        return wholeSUm-arrSum;
    }

    public static void main(String[] args) {
        int[] arr={1,4,3};
        System.out.println(missing(arr));    
    }   
}
