public class SearchInsertPos {

    public static int search(int[] arr,int data){
        int lb=0;
        int ub=arr.length-1;
        int mid = 0;
        int pos=arr.length;
        while(lb<=ub){
            mid=(lb+ub)/2;
            if(data==arr[mid]){
                return mid;
            }
            if(data<arr[mid]){
                pos=mid;
                ub=mid-1;
            }
            else{
                lb=mid+1;
            }
        }

        return pos;
    }

    public static void main(String[] args) {
        int[] arr={1,3,5,6};
        System.out.println(search(arr, 2));
    }
    
}
