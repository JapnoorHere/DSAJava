import java.util.ArrayList;

public class RearrangeInPosAndNeg {

    public static void rearrange(int[] arr){
        
        // If the array has equal no of pos and neg nos.

        // int[] res = new int[arr.length];
        // int pos=0;
        // int neg=1;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]>=0){
        //         res[pos]=arr[i];
        //         System.out.println("god  " + i);
        //         pos+=2;
        //     }
        //     else{
        //         System.out.println();
        //         System.out.println("jod  " + i);
        //         res[neg] = arr[i];
        //         neg+=2;
        //     }
        // }
        // for(int i : res){
        //     System.out.println(i);
        // }


        // If array does not have equal no. of pos and neg nos.

        ArrayList <Integer> pos = new ArrayList<>();
        ArrayList <Integer> neg = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                pos.add(arr[i]);
            }
            else{
                neg.add(arr[i]);
            }
        }


        if(pos.size()>neg.size()){
            for(int i=0;i<neg.size();i++){
                arr[2*i] = pos.get(i);
                arr[2*i+1] = neg.get(i);
            }
            int ind = neg.size()*2;
            for(int i = neg.size();i<pos.size();i++){
                arr[ind] = pos.get(i);
                ind++;
            }
        }
        else{
            for(int i=0;i<pos.size();i++){
                arr[2*i] = pos.get(i);
                arr[2*i+1] = neg.get(i);
            }
            int ind = pos.size()*2;
            for(int i = pos.size();i<neg.size();i++){
                arr[ind] = pos.get(i);
                ind++;  
            }
        }
        for(int i : arr)
        System.out.println(i);

    }

    public static void main(String[] args) {
        int[] arr={-5 ,-2 ,5 ,2 ,4 ,7 ,1 ,8 ,0 ,-8};
        rearrange(arr);
    }
    
}
