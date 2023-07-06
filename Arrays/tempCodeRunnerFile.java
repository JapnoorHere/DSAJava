ArrayList<Integer> a = new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for (int i = arr.length-1; i >=0; i--) {
            if(arr[i]>max){
                a.add(arr[i]);
                max=arr[i];
            }
        }
        Collections.reverse(a);