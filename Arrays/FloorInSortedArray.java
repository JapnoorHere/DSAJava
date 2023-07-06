public class FloorInSortedArray {

    public static int findFloor(int[] arr){
        int floor = 0;
        int lb = 0;
        int ub = arr.length-1;
        int mid = 0;
        int k =0;
        int res = Integer.MIN_VALUE;
        while(lb<=ub){
            mid = lb+(ub-lb)/2; 
            if(arr[mid] > res && arr[mid] <= k){
                res = arr[mid];
            }
            if(k<arr[mid]){
                ub=mid-1;
            }
            else{
                lb=mid+1;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr ={1 ,2 ,8 ,10, 11 ,12 ,19};
        System.out.println(findFloor(arr));
    }
    
}
