public class MovingAllZeroesToEnd {

    public static void move(int[] arr) {
        int ptr1 = 0;
        int ptr2 = 1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[ptr2]!=0){
                int temp=arr[ptr1];
                arr[ptr1]=arr[ptr2];
                arr[ptr2]=temp;
                ptr1++;
            }
            ptr2++;
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 0, 0, 0, 4, 0, 5, 0, 6 };
        move(arr);
    }
}
