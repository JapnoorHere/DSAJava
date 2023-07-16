public class Kadanesss{

    public static int kadane(int[] arr){
        int sum=0;

        for(int i = 0;i<arr.length;i++){
            sum+=arr[i];
            if(sum<0){
                sum=0;
            }
        }
        
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,-4,-2,5};
        System.out.println(kadane(arr));
    }
}