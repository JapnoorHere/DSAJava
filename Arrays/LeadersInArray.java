import java.util.ArrayList;
import java.util.Collections;

public class LeadersInArray {

    public static void findLeaders(int[] arr) {
        ArrayList<Integer> a = new ArrayList<>();

        int mx = Integer.MIN_VALUE;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > mx) {
                mx=arr[i];
                a.add(arr[i]);
            }
        }
       Collections.reverse(a);
        System.out.println(a);
    }

    public static void main(String[] args) {
        int[] arr = { 25, 221, 19, 18, 22, 19, 18 };
        findLeaders(arr);
    }

}
