import java.util.ArrayList;

public class MaximumOfAllSubArray {
    public static void maxi(int arr[]){

        ArrayList<Integer> a =  new ArrayList<Integer>();
        ArrayList<Integer> max =  new ArrayList<Integer>();
        
        int k=3;
        for(int i=0;i<k && k<=arr.length;i++ , k++){
            max.add(arr[i]);
            a.add(maxi(max));
        }
        System.out.println(a);
    }

    public static int maxi(ArrayList<Integer> max){
        int greatest=max.get(0); 
        System.out.println("@@@@@@@@@@@@@@"); 
        for(int i=1;i<max.size();i++){
            if(max.get(i)>greatest){
                
                System.out.println(max.get(i));
                greatest=max.get(i);
            }
        }
        System.out.println("@@@@@@@@@@@@@@");
        return greatest;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,1,4,5,2,3,6};
        maxi(arr);
    }
    
}
