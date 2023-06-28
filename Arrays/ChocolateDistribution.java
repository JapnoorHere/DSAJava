import java.util.ArrayList;
import java.util.Collections;

public class ChocolateDistribution {

    public static int chocolateDistribution(ArrayList<Integer> arr,int m) {
        int min = Integer.MAX_VALUE;
        Collections.sort(arr);
        int currentMin = 0;
        for (int i = 0; i < i+m-1 && i+m-1<arr.size(); i++) {
            currentMin = arr.get(i+m-1) - arr.get(i);
            if (currentMin < min) {
                min = currentMin;
            }
            if(min==Integer.MAX_VALUE){
                min=0;
            }
        }
        return min;
    
    }
    
    public static void main(String[] args) {
        ArrayList <Integer> arr = new ArrayList<>();
        arr.add(52);
        arr.add(55);
        arr.add(100);
        arr.add(33);
        System.out.println(chocolateDistribution(arr,1));
    }
}
