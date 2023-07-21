public class RemoveElement {

    public static void remove(int[] arr,int data){
        int k = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != data){
                arr[k] =arr[i];
                k++;
            }
        }
        for(int i = 0;i<k;i++){
            System.out.println(arr[i]);
        }
        
    }

    public static void main(String[] args) {
        int[] arr={3,2,2,3};
        remove(arr,3);

    }
    
}
