import java.util.ArrayList;
import java.util.List;

class MajorityElementN3{

    public static void findMajority(int[] arr){
        int el1=Integer.MIN_VALUE;
        int el2=Integer.MIN_VALUE;
        int ct1=0;
        int ct2=0;
        for(int i=0;i<arr.length;i++){
            if(ct1 == 0 && arr[i] !=el2){
                el1=arr[i];
                ct1=1;
            }
            else if(ct2==0 && arr[i] !=el1){
                el2=arr[i];
                ct2=1;
            }
            else if(el1==arr[i]){
                ct1++;
            }
            else if(el2==arr[i]){
                ct2++;
            }
            else{
                ct1--;
                ct2--;
            }
            
        }
        ct1=0;
        ct2=0;
        List <Integer>  a= new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==el1) ct1++;
            if(arr[i]==el2) ct2++;
        }
        if(ct1>arr.length/3) a.add(el1);
        if(ct2>arr.length/3) a.add(el2);

        System.out.println(a);
    }

    public static void main(String[] args) {
        int[] arr={1,1,1,2,3,3};
        findMajority(arr);
    }
}