class ReverseInArray{

    public static void reverse(int arr[]){
        int left=0;
        int right =arr.length-1;
        while(left<right){
            arr[left]=arr[left]^arr[right];
            arr[right]=arr[left]^arr[right];
            arr[left]=arr[left]^arr[right];
            left++;
            right--;
        }
    }
    
    public static void main(String[] args) {
        int []arr={9,8,7,6,5,4,3,2,1};
        reverse(arr);
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);

    }
}