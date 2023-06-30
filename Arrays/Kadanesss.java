public class Kadanesss {

   public static int kadaness(int[] arr){
        int currentMax=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(currentMax<0){
                currentMax = arr[i];
            }
            else{
                currentMax += arr[i];
            }
        }
        if(currentMax>max){
            max=currentMax;
        }
        return currentMax;
   }

    public static void main(String[] args) {
        int arr[] = { -1, 2,3,-2,5};
        System.out.println(kadaness(arr));
    }
}