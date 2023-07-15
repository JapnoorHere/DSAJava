public class ZigZagLL {
    public static Node head;
    public static Node tail;
    public static int size;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        System.out.println(head.data);
    }

    public static void zigZag(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node leftHead = head;
        Node rightHead = prev;

        Node nextL,nextR;

        while(leftHead!=null && rightHead!=null){
            nextL = leftHead.next;
            leftHead.next = rightHead;
            nextR = rightHead.next;
            rightHead.next = nextL;

            leftHead = nextL;
            rightHead = nextR;
        }
        
    }

    public static void main(String[] args) {
        ZigZagLL ll = new ZigZagLL();

        addFirst(5);
        addFirst(4);
        addFirst(3);
        addFirst(2);
        addFirst(1);

        zigZag();

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }   



    }

}
