class QuickSort{

    public static void quickSort(int[] arr,int lb,int ub){
        //base case
        if(lb>=ub){
            return;
        }
        //puts pvt element at right place and returns its index
        int indx = partition(arr,lb,ub);
        //recursive calls with sub arrays
        quickSort(arr, lb, indx-1);
        quickSort(arr, indx+1, ub);
    }

    public static int partition(int[] arr,int lb,int ub){
        int i =lb-1;    
        int pvt = arr[ub];//last element as pivot
        for(int j = lb;j<ub;j++){//always starts from lower bound
            //if the element is smaller than pvt 
            if(arr[j] <= pvt){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //swap pvt(place at right pos) and last element in array
        i++;
        int temp = pvt;
        arr[ub] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int[] arr={4,1,8,3,0,1,5,2,7,9,3,2,1,6,8,4,3};
        quickSort(arr,0,arr.length-1);
        for(int i : arr){
            System.out.println(i);
        }
    }
}
