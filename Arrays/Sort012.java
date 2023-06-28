public class Sort012 {
    public static void sort12(int arr[]) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr,mid,low);
                mid++;
                low++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr,mid,high);
                high--; 
            }
            
        }
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);
    }
    public static void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void main(String[] args) {
        int arr[]={1,0,1,2,1,0,2,2,1};
        sort12(arr);
    }
}
