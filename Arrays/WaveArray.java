public class WaveArray {
    public static void main(String[] args) {
       int arr[]= {2,4,7,8,9,10};
       waveArray(arr);
    }
    public static void waveArray(int arr[]){
            for(int i=0;i<arr.length-1;i+=2){
                arr[i] = arr[i] ^ arr[i+1];
                arr[i+1] = arr[i] ^ arr[i+1];
                arr[i] = arr[i] ^ arr[i+1];
            }
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
    }

}
