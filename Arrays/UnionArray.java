import java.util.ArrayList;

public class UnionArray {
    
    public static void union(int arr[],int brr[]){
        ArrayList <Integer> a=new ArrayList<>();
        int one=0;    
        int second=0;
        while(one<arr.length && second<brr.length){
            if(arr[one]<=brr[second]){
                if(a.size()==0 || a.get(a.size()-1)!=arr[one]){
                    a.add(arr[one]);
                }
                one++;
            }
            
            else{
                if(a.size()==0 || a.get(a.size()-1)!=brr[second]){
                    a.add(brr[second]);
                }
                second++;
            }
        }   
        while(one<arr.length){
            if(a.get(a.size()-1)!=arr[one]){
                a.add(arr[one]);
            }
            one++;
        } 
        
        while(second<brr.length){
            if(a.get(a.size()-1)!=brr[second]){
                a.add(brr[second]);
            }
            second++;
        } 
        for(int i: a)
        System.out.println(i);
    }    
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] brr={2,2,3,5,6};
        union(arr,brr);
    }    
}
