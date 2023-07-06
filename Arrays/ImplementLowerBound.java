public class ImplementLowerBound {

    public static int lowerBound(int[] arr, int data){
        int res=arr.length;
        int lb=0;
        int ub=arr.length-1;
        int mid = 0;
        while(lb<=ub){
            mid=(lb+ub)/2;
            if(arr[mid]>=data){
                res=mid;
                ub=mid-1;
            }
            else{
                lb=mid+1;
            }
        }
        
        return res;
    }
    
    public static int upperBound(int[] arr, int data){
        int res=arr.length;
        int lb=0;
        int ub=arr.length-1;
        int mid = 0;
        while(lb<=ub){
            mid=(lb+ub)/2;
            if(arr[mid]>data){
                res=mid;
                ub=mid-1;
            }
            else{
                lb=mid+1;
            }
        }
        
        return res;
    }

public static void main(String[] args) {
    int[] arr={1,2,3,4,6,7,8};
    System.out.println(lowerBound(arr,5));
}
    
}
