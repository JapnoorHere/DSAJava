public class Sort012 {
    
    public static void sort012(int[] arr){
        int first=0;
        int second=0;
        int third=arr.length-1;

        while(second<=third){
            if(arr[second]==0){
                swap(arr, first, second);
                first++;
                second++;
            }
            else if(arr[second]==1){
                second++;
            }
            else{
                swap(arr, second, third);
                third--;
            }
        }
        for(int i : arr){
            System.out.println(i);
        }
    }

    public static void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void main(String[] args) {
        int arr[]={1,0,1,2,1,0,2,2,1};
        sort012(arr);
    }
}
