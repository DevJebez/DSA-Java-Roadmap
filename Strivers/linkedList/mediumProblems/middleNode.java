class Node{
    int data;
    Node next; 
    Node(int data1, Node next1){
        this.data = data1;
        this.next= next1;
    }
    Node(int data1){
        this.data = data1;
        this.next= null;
    }
}

public class middleNode{
    private static Node ArrayToLL(int[] arr){
        Node head = new Node(arr[0]);
        Node current = head;
        for(int i = 1; i< arr.length ; i++){
            Node temp = new Node(arr[i]);
            current.next = temp;
            current = current.next; // or current = temp;
        }
        return head;
    }
    private static Node middlenode(Node head){
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void main(String args[]){
        int[] arr = {2,5,6,8,9,10,11,12,13};
        Node head = ArrayToLL(arr);
        System.out.println(middlenode(head).data);
    }
}

