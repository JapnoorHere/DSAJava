public class MajorityElementN2 {

    public static int findMajority(int[] arr){
        int data = Integer.MIN_VALUE;
        int count =0 ;
        for(int i=0;i<arr.length;i++){
            if(data == arr[i]){
                count++;
            }
            else if(count == 0){
                data = arr[i];
                count++;
            }
            else{
                count--;
            }
        }

        count = 0;
        for(int i=0;i<arr.length;i++){
            if(data == arr[i]){
                count++;
            }
        }
        if(count > arr.length/2)
        return data;

        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,2,2,1,1,1,1,1,1,1,1};
        System.out.println(findMajority(arr));
    }
}
