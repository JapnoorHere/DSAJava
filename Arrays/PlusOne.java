public class PlusOne {

    public static void plusOne(int[] arr) {

        arr[arr.length - 1]++;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i] == 10){
                arr[i] = 0;
                arr[i-1] += 1;  
            }
        }   
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 3, 4,5};
        plusOne(arr);
    }
}
