public class MergeSortLL {

    public static Node head;
    public static Node tail;
    public static int size;

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static Node findMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node merge(Node leftHead, Node rightHead){
        //new ll
        Node tempLL = new Node(-1);
        //temp for traversing on new ll 
        Node temp = tempLL;
        //checking rhe data from botht the sub ll and store it in new ll and so on
        while(leftHead != null && rightHead != null){
            if(leftHead.data <= rightHead.data){
                temp.next= leftHead;
                leftHead = leftHead.next;
            }
            else{   
                temp.next = rightHead;
                rightHead = rightHead.next;
            }
            temp = temp.next;
        }
        //if one of the ll gets to null then just simply add elements from other sub ll
        //for left ll
        while(leftHead != null){
                temp.next = leftHead;
                leftHead = leftHead.next;
                temp = temp.next;
        }
        //for right ll
        while(rightHead != null){
                temp.next = rightHead;
                rightHead = rightHead.next;
                temp = temp.next;
        }
        //returning the new linked list's head's next element because the first element contains -1 value which should be treated as deleted
        return tempLL.next;
        
    }

    public static Node divide(Node head){
        //base case
        if(head == null || head.next == null){
            return head;
        }
        //find mid fun()
        Node mid = findMid(head);
        //left sub ll
        Node leftHead = head;
        //right sub ll
        Node rightHead = mid.next;
        //seperating middle ll from middle
        mid.next = null;

        //recurive calling for divide
        Node newLeft = divide(leftHead);
        Node newRight = divide(rightHead);

        //calling merge on both linked list and returing head of new ll which will be returned from merge() fun
        return merge(newLeft, newRight);
    }

    public static void main(String[] args) {
        MergeSortLL ll =new MergeSortLL();
        //adding elements in ll
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);

        Node print = head;
        //printing old ll
        while(print != null){
            System.out.print(print.data + " -> ");
            print = print.next;
        }
        System.out.print("NULL");
        System.out.println();

        //calling merge sort divide fun()
        Node head1 = divide(head);

        Node print1 = head1;
        //printing new ll
        while(print1 != null){
            System.out.print(print1.data + " -> ");
            print1 = print1.next;
        }
        System.out.print("NULL");
    }
    
}
