public class MinimumInRotatedSorted {

    public static int search(int[] arr){
        int min=Integer.MAX_VALUE;
        int lb=0;
        int ub=arr.length-1;
        while(lb<=ub){
            int mid=(lb+ub)/2;
            if(arr[lb]<=arr[mid]){
                min=Math.min(min, arr[lb]);
                lb=mid+1;
            }
            else{
                min=Math.min(min, arr[mid]);
                ub=mid-1;
            }
        }
        return min;

    }
    public static void main(String[] args) {
        int[] arr={6,7,8,9,3,4,5};
        System.out.println(search(arr));
    }
    
}
