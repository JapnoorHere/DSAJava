import java.util.ArrayList;
import java.util.Collections;

public class LeadersInArray {

    public static void findLeaders(int[] arr) {
        ArrayList<Integer> a = new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for (int i = arr.length-1; i >=0; i--) {
            if(arr[i]>max){
                a.add(arr[i]);
                
            }
            max=Math.max(max, arr[i]);
        }
        Collections.reverse(a);
        for (int i : a)
            System.out.println(i);
    }

    public static void main(String[] args) {
        int[] arr = { 25, 221, 19, 18, 22,19,18};
        findLeaders(arr);
    }

}
