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
public class linkedList{
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

    private static void print(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    
    private static int lengthOfLL(Node head){
        int count = 0;
        Node temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    private static int search(Node head, int k){
        Node temp = head;
        while(temp != null){
            if(temp.data == k){
                return 1;
            }
        }
        return 0;
    }
    private static Node removeHead(Node head){
        if(head == null) return head;
        //Node temp = head;
        head = head.next;
        //System.out.println(head.data);
        return head;
    }
    private static Node removeTail(Node head){
        if(head == null || head.next == null) return null;
        Node temp = head;
        while(temp.next.next != null){
            temp= temp.next;
        }
        temp.next = null;
        return head;
    }
    private static Node removeK(Node head, int pos){
        if(head == null) return head;
        if(pos == 1){
            head = head.next;
            return head;
        }
        Node temp = head;
        Node prev = null;
        int count = 0;
        while(temp != null){
            count++;
            if(count == pos){
                prev.next= temp.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
    public static void main(String args[]){
        int[] arr = {2,5,6,8,9,10,11,12,13};
        Node head = ArrayToLL(arr);
        print(head);
        System.out.println("\nLength of the linked list:"+lengthOfLL(head));
        head = removeHead(head);
        System.out.println("Head is removed :");print(head);
        removeTail(head);
        break;
        System.out.println("\nTail is removed :");print(head);
        int k = 4;
        head = removeK(head, k);
        System.out.println("\nAfter removing "+k+"th element:");print(head);
        /* Manual way of converting array to LL
        Node n4 = new Node(arr[3]);
        Node n3 = new Node(arr[2], n4);
        Node n2 = new Node(arr[1], n3);
        Node n1 = new Node(arr[0],n2);
        System.out.println(n2.data+" "+ n2.next.data);
        */
    }
}