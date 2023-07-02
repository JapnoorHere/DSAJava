public class ProductOfArrayExceptSelf {

   
    public static void productOfArrayExceptSelf(int[] arr){
        int pro=1;
        int productArr[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            productArr[i]=pro;
            pro*=arr[i];
        }
        pro=1;
        for(int i=arr.length-1;i>=0;i--){
            productArr[i]*=pro;
            pro*=arr[i];
        }
        for(int i : productArr)
        System.out.println(i);
    }


    public static void main(String[] args) {
        int[] arr={2,2,3,4};
        //24,12,8,6
        //1,1,2,6
        //24,12,4,1
        productOfArrayExceptSelf(arr);
    }
}
