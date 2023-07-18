import java.util.ArrayList;

public class UnionArray {

    public static void union(int arr[], int brr[]) {
        ArrayList<Integer> a = new ArrayList<>();
        int one = 0;
        int two = 0;

        while (one < arr.length && two < brr.length) {
            if (arr[one] <= brr[two]) {
                if (a.size() == 0 || a.get(a.size() - 1) != arr[one]) {
                    a.add(arr[one]);
                }
                one++;
            } else if (brr[two] <= arr[one]) {
                if (a.size() == 0 || a.get(a.size() - 1) != brr[two]) {
                    a.add(brr[two]);
                }
                two++;
            }
        }

        while (one < arr.length) {
            if (a.size() == 0 || a.get(a.size() - 1) != arr[one]) {
                a.add(arr[one]);
            }
            one++;
        }

        while (two < brr.length) {
            if (a.size() == 0 || a.get(a.size() - 1) != brr[two]) {
                a.add(brr[two]);
            }
            two++;
        }
        System.out.println(a);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] brr = { 2, 2, 3, 5, 6 };
        union(arr, brr);
    }
}
