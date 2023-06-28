public class MinAndMaxElementInArray {

    public static void main(String[] args) {
        long arr[]={3, 2, -56, 10000, 167};
        mini(arr);
        maxi(arr);
    }

    public static void mini(long arr[]){
        long min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum element is " + min);
    }
    
    public static void maxi(long arr[]){
        long max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum element is " + max);
    }
    
}
