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