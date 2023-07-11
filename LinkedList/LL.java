class LL {
    public static Node head;
    public static Node tail;
    public static int size;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

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

    public Node findMid(){
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public int size() {
        return size;
    }

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
        list.addFirst("World");
        System.out.println(list.size());
        list.addFirst("Hello");
        list.print();
        list.addLast("!");
        list.print();
        list.add(2, "yo");
        list.print();
        list.add(0, "yo");
        list.print();

        int pos = list.search("!");
        if(pos == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at " + pos);
        }

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
        System.out.println(list.findMid().data);
    
    }
}