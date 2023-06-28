public class SumSubArrays {
 public static void main(String[] args) {
        int []arr={-1,5,-7,-9,4,1,-2};
        printSubArrays(arr);
    }

    private static void printSubArrays(int[] arr) {
        int countSubArrays = 0;
        int sumOfSubArray =0;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    sumOfSubArray+=arr[k];
                    System.out.print(arr[k] + " ");
                }
                System.out.println("Sum -> " + sumOfSubArray);
                sumOfSubArray=0;
                countSubArrays++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("There are " + countSubArrays +" sub arrays");
    }
}
