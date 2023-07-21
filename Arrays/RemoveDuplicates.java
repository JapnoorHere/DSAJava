public class RemoveDuplicates {

    public static void remove(int[] arr){
        int ptr1=0;  
        int ptr2 = 0;
        int count=1;
        for(int i=0;i<arr.length-1;i++){
            ptr2=i+1;
            if(arr[ptr1]!=arr[ptr2]){
                arr[ptr1+1]=arr[ptr2];
                ptr1=ptr1+1;
                count++;
            }
        }
        System.out.println("count" + (count));
        for(int i : arr){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,3,3,3,4};
        remove(arr);
    }
    
}
