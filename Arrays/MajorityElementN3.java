import java.util.ArrayList;

class MajorityElementN3{

    public static void findMajority(int[] arr){
       int data1= Integer.MIN_VALUE;
       int data2 = Integer.MIN_VALUE;
        int ct1=0;
        int ct2=0;

        for(int i=0;i<arr.length;i++){
            if(ct1 == 0 && arr[i]!=data2){
                data1 = arr[i];
                ct1=1;
            }
            else if(ct2 == 0 && arr[i]!=data1){
                data2 = arr[i];
                ct2=1;  
            }
            else if(data1 == arr[i]){
                ct1++;
            }
            else if(data2 == arr[i]){
                ct2++;
            }
            else{
                ct1--;
                ct2--;
            }
        }

        ArrayList<Integer> a= new ArrayList<>();
        ct1=0;
        ct2=0;

        for(int i =0;i<arr.length;i++){
            if(arr[i] == data1)
                ct1++;         
                
                if(arr[i] == data2)
                ct2++;            
        }


        if(ct1 > arr.length/3) a.add(data1);
        if(ct2 > arr.length/3) a.add(data2);
        
        System.out.println(a);

    }

    public static void main(String[] args) {
        int[] arr={1,1,1,2,3,3,3};
        findMajority(arr);
    }
}