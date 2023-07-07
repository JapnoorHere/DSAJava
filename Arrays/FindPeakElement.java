public class FindPeakElement {

    public static int peak(int[] arr){
        int peak=0;
        int lb=0;
        int ub=arr.length-1;
        int mid=0;
        if(arr.length==1) return 0;
        if(arr[0]>arr[1]) return 1;
        if(arr[arr.length-1]>arr[arr.length-2]) 
        {
            return 1;
        }
            while(lb<=ub){
            mid=(lb+ub)/2;
            if(arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]){
                peak=1;
                return peak;
            }
            if(arr[mid] < arr[mid-1]){
                ub=mid-1;
            }
            else{
                lb=mid+1;
            }
        }
        return peak;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.println(peak(arr));
    }
    
}
