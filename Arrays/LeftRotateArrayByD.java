public class LeftRotateArrayByD {
    
   public static void rotate(int[] arr,int d){

        rev(arr, 0, d);
     for(int i:arr)
        System.out.println("firs" + i);
        rev(arr, d+1, arr.length-1);
     for(int i:arr)
        System.out.println("sec" + i);
        rev(arr, 0, arr.length-1);
        for(int i:arr)
        System.out.println(i);

   } 

   public static void rev(int[] arr,int start,int end){
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
   }

    public static void main(String[] args) {
        int[] arr={5,1,4,9,8};
        rotate(arr,4);
    }
}
