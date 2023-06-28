public class PairsInArray {

    public static void pairs(int num[]) {
        int countPairs = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                System.out.print("(" + num[i] + "," + num[j] + ")");
                countPairs++;
            }
            System.out.println();
        }
        System.out.println("Total pairs" + countPairs);
    }

    public static void main(String[] args) {
        int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        pairs(arr);
    }

}
