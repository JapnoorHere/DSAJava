import java.util.ArrayList;

public class UnionArray {
    
    public static void union(int arr[],int brr[]){
        ArrayList<Integer> a =  new ArrayList<>();
        int ptr1=0;
        int ptr2=0;
        while(ptr1<arr.length && ptr2<brr.length){
            if(arr[ptr1]<=brr[ptr2]){
                if(a.size()==0 || a.get(a.size()-1)!=arr[ptr1]){
                    a.add(arr[ptr1]);
                }
                ptr1++;
            }
            else{
                if(a.size()==0 || a.get(a.size()-1)!=brr[ptr2]){
                    a.add(brr[ptr2]);
                }
                ptr2++;
            }
        }

        while(ptr1<arr.length){
                if(a.get(a.size()-1)!=arr[ptr1]){
                    a.add(arr[ptr1]);
                }
                ptr1++;
        }
        
        while(ptr2<brr.length){
               if(a.get(a.size()-1)!=brr[ptr2]){
                    a.add(brr[ptr2]);
                }
                ptr2++;
        }

        for(int i : a){
            System.out.println(i);
        }

    }    
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] brr={2,2,3,5,6};
        union(arr,brr);
    }    
}
