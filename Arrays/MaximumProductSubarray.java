public class MaximumProductSubarray {

    public static int product(int arr[]){
        int pre=1;
        int preMax=Integer.MIN_VALUE;
        int suf=1;
        int sufMax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(pre==0) pre=1;
            if(suf==0) suf=1;
            pre*=arr[i];
            if(pre>preMax){
                   preMax=pre;
            }
            suf*=arr[arr.length-i-1];
            if(suf>sufMax){
                sufMax=suf;
            }
        }
        if(preMax>sufMax)
        return preMax;
        else
        return sufMax;
    }

    public static void main(String[] args) {
        int arr[]={2, 3, 4, 5, -1, 0};
        System.out.println(product(arr));
    }
}
