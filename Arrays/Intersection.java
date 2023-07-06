public class Intersection {
    
    public static void intersection(int[] arr,int[] brr){
        int one=0;
        int sec=0;
        int count=0;
        
        while(one<arr.length && sec<brr.length){
            if(arr[one]==brr[sec]){
                count++;
                one++;
                sec++;
            }
            else if(arr[one]<brr[sec]){
                one++;
            }
            else{
                sec++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int[] arr={1,2,4,5,6,6,7,8,9}; 
        int[] brr={3,4,5,5,6,7} ;
        intersection(arr,brr);
    }
}
