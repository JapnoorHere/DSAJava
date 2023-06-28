public class PrintSubArray {
    public static void main(String[] args) {
        int []arr={9,8,7,6,5};
        printSubArrays(arr);
    }

    private static void printSubArrays(int[] arr) {
        int countSubArrays = 0;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k] + " ");
                }
                countSubArrays++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("There are " + countSubArrays +" sub arrays");
    }
}
