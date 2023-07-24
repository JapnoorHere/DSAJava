public class FindNumberOfTimesArrayRotated {

    

    public static void main(String[] args) {
        int[] arr={3,4,5,1,2};
        System.out.println(findRotation(arr));

    }
    public static int findRotation(int[] arr){
        int lb=0;
        int ub=arr.length-1;
        int mid=0;
        int loc=-1;
        int min = Integer.MAX_VALUE;
        while(lb<=ub){
            mid=(ub+lb)/2;
            if(arr[lb]<=arr[mid]){
                if(arr[lb]<min){
                    min=arr[lb];
                    loc=lb;
                }
                lb=mid+1;
            }
            else{
            if(arr[mid]<min){
                min=arr[mid];
                loc=mid;
            }
                ub=mid-1;
            }
        }
        return loc;
    }
    
}
