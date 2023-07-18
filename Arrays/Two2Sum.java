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

    public static void findIndexMap(int[] arr,int data){
        HashMap<Integer,Integer> map = new HashMap<>();
        int idx1=-1;
        int idx2=-1;
        
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],i);
        }

        for(int i =0;i<arr.length;i++){
            int sub = data-arr[i];
            if(map.containsKey(sub) && map.get(sub)!=i){
                idx1=i;
                idx2=map.get(sub);
                break;
            }
        }
        System.out.println(idx1);
        System.out.println(idx2);

    }

    public static void main(String[] args) {
        int[] arr={2,7,14,15,7};
        ArrayList <Integer> a= new ArrayList<>();
        // findIndexLoop(arr, 22) ;       
        findIndexMap(arr, 14) ;       
    }
    
}
