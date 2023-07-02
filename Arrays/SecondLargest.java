public class SecondLargest {

    public static int findSecondLargest(int[] arr){
        int first=Integer.MIN_VALUE;
        int second=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>first){
                second=first;
                first=arr[i];
            }
            if(second<arr[i] && arr[i]<first){
                second=arr[i];
            }
        }
        return second;
    }

    public static void main(String[] args) {
        int[] arr = {200,11,3,9,15};
        System.out.println(findSecondLargest(arr));    
    }
    
}
