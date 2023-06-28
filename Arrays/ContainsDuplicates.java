import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {

    public static boolean containsDuplicates(int arr[]){
            // for(int i=0;i<arr.length;i++){
            //     for(int j=i;j<arr.length;j++){
            //         if(arr[i]==arr[j] && i!=j)
            //             return true;
            //     }
            // }

            Set<Integer> set =  new HashSet<>();
            for(int a : arr){
                set.add(a);
            }
            if(set.size()!=arr.length){
                return true;
            }
            
        return false;
    }

    public static void main(String[] args) {
        int arr[]= {1,2,2};
        System.out.println(containsDuplicates(arr));
    }
}
