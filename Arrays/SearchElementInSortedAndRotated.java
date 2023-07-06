public class SearchElementInSortedAndRotated {

    public static int searchElementInSortedAndRotated(int a[],int data){
        int lb=0;
        int ub=a.length-1;
        int mid=0;
        while(lb<=ub){
        mid = lb + (ub - lb)/2; 
            if(data==a[mid]){
                System.out.println(a[mid]);
                return mid;
            }
            System.out.println(a[mid]);
            if(a[lb]<=a[mid]){
                if(data>=a[lb] && data<a[mid]){
                    ub=mid-1;
                }
                else{
                    lb=mid+1;
                }
            }
            else{
                if(data>a[mid] && data<=a[ub]){
                    lb=mid+1;
                }
                else{
                    ub=mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,0,1,1,1};
        // int arr[]={5,6,7,8,9,10,1,2,3};
        System.out.println(searchElementInSortedAndRotated(arr,0));
    }    
}
