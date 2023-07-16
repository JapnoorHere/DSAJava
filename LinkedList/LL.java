class LL {

    public static Node head;
    public static Node tail;
    public static int size;


    //Node class
    static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }


    //add element at first pos
    public void addFirst(String data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }


    //add element at last pos
    public void addLast(String data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }


    //add element at given index
    public void add(int index, String data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        if(index >= size){
            addLast(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        int count = 0;
        while (count < index-1) {
            count++;
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }


    //removes element from first pos
    public void removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return;
        } else if (size == 1) {
            String value = head.data;
            head = tail = null;
            size--;
            return;
        }
        String value = head.data;
        head = head.next;
        size--;
    }

    //remove element form last pos
    public void removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return;
        } else if (size == 1) {
            String value = head.data;
            head = tail = null;
            size--;
            return;
        }

        Node prev = head;
        for(int i=0;i<size-2;i++){
            prev = prev.next;
        }
        
        String value = tail.data;
        prev.next = null;
        tail = prev;
        size--;
    }

    //remove element from given index
    public void remove(int index){
        if(index == 0){
            removeFirst();
            return;
        }
        else if(index >= size-1){
            removeLast();
            return;
        }
        else if(size == 0){
            System.out.println("LL is empty");
            return;
        }
        else if(size == 1){
            String value = head.data;
            head = tail =null;
            size--;
            return;
        }
        Node prev = head;
        Node temp = head;
        int count = 0;
        while(count<index-1){
            count++;
            prev=prev.next;
            temp = prev.next;
        }
        String value = temp.data;
        prev.next = temp.next;
        size--;
    }
    
    //remove nth node from end 
    public void removeNnodeFromEnd(int index){
        if(size == 0){
            System.out.println("LL is empty");
            return;
        }
        else if(size == 1){
            String value = head.data;
            head = tail =null;
            size--;
            return;
     }
        int n = size-index;    
        Node prev = head;
        Node temp = head;
        int count = 0;
        while(count<n){
            count++;
            prev=prev.next;
            temp = prev.next;
        }
        String value = temp.data;
        prev.next = temp.next;
        size--;
    }

    //search for target lement -> Linear search
    public int search(String target){
        int count=-1;
        if(head == null){
            return count;
        }
        Node temp = head;
        while(temp!=null){
            count++;
            if(temp.data==target){
                return count;
            }
            temp=temp.next;
        }
        return -1;
    }


    //reverse ll by pointing every element to its previous -> uses 3 elements or varaibles
    public void reverse(){
        Node curr = tail = head;
        Node prev = null;
        while(curr!=null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;            
        } 
        head = prev;
    }

    // find middle using slow fast technique or Floyd's Cycle Finding Algo
    public Node findMid(){
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    //check is ll is palinrome or not uing floyd's cycle finding algo or slow fast technique
    public boolean checkPalindrome(){
        if(head == null && head.next==null){
            return true;
        }
        Node midNode = findMid();
        Node curr = midNode;
        Node prev = null;
        Node next ;
        while(curr != null){
            next = curr.next;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;

        while(right!=null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }


    // detetcts if ll containst loop somewhere at middle element or not other than head
    public static boolean detectLoop(){
        Node slow = head;
        Node fast = head;
        
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        
        return false;
    }


    // delete the loops if there
    public static void deleteLoop(){
        Node slow = head;
        Node fast = head;
        boolean isCycle = false;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                isCycle = true;
                break;
            }
        } 
        if(isCycle){
        slow = head;
        Node prev = null;
        while(slow != fast){
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        }

        prev.next = null;
    }
            return;
    }

    public static void swapXandY(){
        Node temp = head;
        int count =0;
        int x=2;
        int y=4;
        Node save1 = null;
        Node save2 = null;

        while(temp != null){
            temp = temp.next;
            count++;
            if(count == x-1){
                save1 = temp.next;
                temp.next=null;
            }
            if(count == y-1){

            }
        }
    }
    
    //return size of ll
    public int size() {
        return size;
    }

    //print the ll
    public void print() {
        if (head == null) {
            System.out.println("Linked List is null");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    
    public static void main(String[] args) {
        LL list = new LL();
        // list.addFirst("World");
        // System.out.println(list.size());
        // list.addFirst("Hello");
        // list.print();
        // list.addLast("!");
        // list.print();
        // list.add(2, "yo");
        // list.print();
        // list.add(0, "yo");
        // list.print();

        // int pos = list.search("!");
        // if(pos == -1){
        //     System.out.println("Element not found");
        // }
        // else{
        //     System.out.println("Element found at " + pos);
        // }

        // list.reverse();
        // list.print();
        
        // list.removeNnodeFromEnd(0);
        // list.print();

        // list.removeFirst();
        // list.print();
        
        // list.removeLast();
        // list.print();
        
        // System.out.println(list.size());

        // list.remove(3);
        // list.print();
        // System.out.println(list.size());
        
        // list.add(3, "jsdnjs");
        // list.add(10,"jod");
        // list.print();
        // System.out.println(list.size());   
        // System.out.println(list.findMid().data);

        head = new Node("dmnfjkew");
        head.next = new Node("2");
        head.next.next = new Node("3");
        head.next.next.next = head.next;
        // deleteLoop();
        System.out.println(detectLoop());
    }
}