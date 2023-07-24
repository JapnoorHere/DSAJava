public class FloorAndCeil {

    //works for sorted array

    public static int[] floorAndCeil(int[] arr,int data){
        int floor=0;
        int ceil=0;
        int lb=0;
        int ub=arr.length-1;
        int mid=0;
        while(lb<=ub){
            mid=(lb+ub)/2;
            if(arr[mid]>=data){                                             
                floor=mid-1;
                ceil=mid;
                ub=mid-1;
            }
            else{
                lb=mid+1;
            }
        }
        return new int[]{floor,ceil};
    }

    public static void main(String[] args) {
        int[] arr={5,6,8,8,9};
        int[] res=floorAndCeil(arr, 4);
        for(int i : res)
        System.out.println(i);
    }
}
