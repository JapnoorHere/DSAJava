public class NextPermutation {

    public static void nextPermutation(int[] arr) {
        int breakingPoint = -1;
        int min = Integer.MAX_VALUE;
        int minLoc= 0;
        for(int i=arr.length-1;i>=1;i--){
            if(arr[i]>arr[i-1]){
                breakingPoint = i-1;
                System.out.println(breakingPoint + "ff");
                break;
            }
        }
        if(breakingPoint == -1){
            rev(arr, 0, arr.length-1);
            return;
        }

        for(int i=arr.length-1;i>breakingPoint;i--){
            if(arr[i]<min && arr[breakingPoint]<=arr[i]){
                min = arr[i];
                minLoc = i;
            }
        }
        int temp = arr[minLoc];
        arr[minLoc] = arr[breakingPoint];
        arr[breakingPoint] = temp;
    
        rev(arr, breakingPoint+1, arr.length-1);
    }

    public static void rev(int[]arr, int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        // int arr[] = {2,1,5,4,3,0,0};
        // int arr[] = {2,3,1,8,7,4};
        // int arr[] = { 3, 6, 4, 5, 2 };
        int arr[] = {1,3,2};  
        // int arr[] = {2,4,1,5,4};  
        nextPermutation(arr);
        for (int i : arr)
            System.out.println(i);
    }
}
