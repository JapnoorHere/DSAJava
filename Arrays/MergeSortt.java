class MergeSortt {
    
    public static void divide(int[] arr,int lb,int ub){
        //base condition
        if(lb>=ub){

            return;
        }
        //calculate mid
        int mid= lb+(ub-lb)/2;
        //recursie call -> Dividing the arrays in sub arrays
        divide(arr,lb,mid);//left part
        divide(arr,mid+1,ub);//right part
        
        merge(arr,lb,mid,ub);//starts merging process
    }

    public static void merge(int[] arr,int lb,int mid,int ub){
        int k=0;//couter for transfering temporary array's elements to main array
        int lb1=lb;//lb of left arr
        int ub1=mid;//ub of left arr
        int lb2=mid+1;//lb of right arr
        int ub2=ub;//ub of right arr
        int temp[] = new int[ub-lb+1];//temp array


        while(lb1<=ub1 && lb2<=ub2){
            if(arr[lb1]<arr[lb2]){ //checks from both the arrays which element is bigger
                temp[k++]=arr[lb1++]; 
            }
            else{
                temp[k++] = arr[lb2++];
            }
        }
        //remaining left array if any
        while(lb1<=ub1){
            temp[k++]=arr[lb1++];
        }
        //remaining right array if any
        while(lb2<=ub2){
            temp[k++]=arr[lb2++];
        }
        //transfering back to original array
        for(k=0,lb1=lb;k<temp.length;k++,lb1++){
            arr[lb1] = temp[k];
        }

    }
    
    public static void main(String[] args) {
        int[] arr={4,6,1,2,8,3,3};
        divide(arr,0,arr.length-1);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
}
