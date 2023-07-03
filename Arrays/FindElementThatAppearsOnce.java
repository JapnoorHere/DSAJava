public class FindElementThatAppearsOnce {

    public static int search(int[] arr){
       int xor=0;
       for(int i=0;i<arr.length;i++)
        xor^=arr[i];

        return xor;
    }

    public static void main(String[] args) {
        int[] arr={1,1,2,5,5};
        System.out.println(search(arr));
    }
    
}
