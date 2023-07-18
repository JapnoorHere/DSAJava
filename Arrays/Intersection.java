import java.util.ArrayList;

public class Intersection {
    
    public static void intersection(int[] arr,int[] brr){
        int one = 0;
        int two = 0;
        ArrayList<Integer> a = new ArrayList<>();
        while(one<arr.length && two<brr.length){
            if(arr[one] == brr[two]){
                a.add(arr[one]);
                one++;
                two++;
            }
            else if(arr[one] > brr[two]){
                two++;
            }
            else{
                one++;
            }
        }

        System.out.println(a);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5}; 
        int[] brr={2,3,4,5,6} ;
        intersection(arr,brr);
    }
}
