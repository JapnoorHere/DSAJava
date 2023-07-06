import java.util.ArrayList;
import java.util.HashMap;

public class Two2Sum {

    public static void findIndexLoop(int[] arr,int data){
        int ptr1=0;
        int ptr2=arr.length-1;

        //Work for sorted arrays only 
        //If array is sorted and order of indexes does not matter, first sort array
        //Arrays.sort(arr);

        while(ptr1<=ptr2){
            if(arr[ptr1] + arr[ptr2] > data){
                ptr2--;
            }
            else if(arr[ptr1] + arr[ptr2] < data){
                ptr1++;
            }
            else{
                // return new int[] {ptr1,ptr2};
                System.out.println(arr[ptr1] + "    " + arr[ptr2]);
                break;
            }
        }
        // return new int[] {0};
    }

    public static int[] findIndexMap(int[] arr,int data){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<arr.length;i++)
        map.put(arr[i],i);
        for(int i=0;i<arr.length;i++){
            int res=data-arr[i];
            if(map.containsKey(res)){
                return new int[] {map.get(res),map.get(arr[i])};
            }
        }
        return new int[] {0};
    }

    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        ArrayList <Integer> a= new ArrayList<>();
        // findIndexLoop(arr, 22) ;       
        findIndexMap(arr, 22) ;       
    }
    
}
