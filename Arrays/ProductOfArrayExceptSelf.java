public class ProductOfArrayExceptSelf {

    public static void productOfArrayExceptSelf(int[] arr) {
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        int prod = 1;
        for (int i = 0; i < left.length; i++) {
            left[i] = prod;
            prod *= arr[i];
        }
        prod =1;
        for (int i = right.length - 1; i >= 0; i--) {
            right[i] = prod;
            prod *= arr[i];
        }

        // System.out.println("left");
        // for(int i:left){
        //     System.out.println(i);
        // }

        // System.out.println("right");
        // for(int i:right){
        //     System.out.println(i);
        // }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = left[i] * right[i];
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,7,1,3};
        productOfArrayExceptSelf(arr);
    }
}
