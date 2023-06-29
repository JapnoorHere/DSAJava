public class ProductOfArrayExceptSelf {

    public static void productOfArrayExceptSelf(int arr[]){
        int product=1;
        int[] res= new int[arr.length];
        for(int i=0;i<res.length;i++){
            res[i]=product;
            product*=arr[i];
        }
        product=1;
        for(int i=res.length-1;i>=0;i--){
            res[i]*=product;
            product*=arr[i];
        }
        
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
        
    }

    public static void main(String[] args) {
        int[] arr={1,0};
        productOfArrayExceptSelf(arr);
    }
}
