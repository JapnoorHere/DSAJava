public class MinimumInRotatedSorted {

    public static int search(int[] arr){
        int min=Integer.MAX_VALUE;
        int lb=0;
        int ub=arr.length-1;
        int loc = -1;
        while (lb<=ub) {
            int mid = (lb+ub)/2;
            if(arr[lb]<=arr[mid]){
                if(arr[mid+1]<min){
                    min = arr[mid+1];
                    loc=mid+1;
                }
                ub=mid-1;
            }
            else{
                if(arr[lb]<min){
                    min =arr[lb];
                    loc=lb;
                }
                lb=mid+1;
            }
        }
        return loc;

    }
    public static void main(String[] args) {
        int[] arr={6,7,1,3,4,5};
        System.out.println(search(arr));
    }
    
}
