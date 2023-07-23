public class MinimumInRotatedSorted {

    public static int search(int[] arr){
        int min=Integer.MAX_VALUE;
        int lb=0;
        int ub=arr.length-1;
        while (lb<=ub) {
            int mid = (lb+ub)/2;
            if(arr[lb]<=arr[mid]){
                min = Math.min(arr[lb], min);
                lb=mid+1;
            }
            else{
                min = Math.min(arr[mid], min);
                ub = mid-1;
            }
        }
        return min;

    }
    public static void main(String[] args) {
        int[] arr={4,5,6,7,2,3};
        System.out.println(search(arr));
    }
    
}
