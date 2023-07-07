public class MajorityElementN2 {

    public static int findMajority(int[] arr){
        int el=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(count==0){
                el=arr[i];
                count=1;
            }
            else if(arr[i]==el){
                count++;
            }
            else{
                count--;
            }
        }
        int count1=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==el)
            count1++;
        }
        if(count1>arr.length/2)
            return el;

        el=-1;
        return el;
    }

    public static void main(String[] args) {
        int[] arr={1,1,1,1,2,2,2,2,2,2,2,23};
        System.out.println(findMajority(arr));
    }
}
