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
    private static Node insertHead(Node head, int val){

        return new Node(val, head); // create a new node and link it to head
    }
    private static Node insertTail(Node head, int val){
        if(head == null){
            return new Node(val);
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(val);
        return head;
    }
    private static Node insertPosition(Node head, int val, int pos){
        if(head == null){
            if(pos == 1) return new Node(val);
            else return head;
        }
        if(pos == 1){
            return new Node(val, head);
        }
        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
            if(count == pos - 1){
                Node x = new Node(val);
                x.next = temp.next;
                temp.next = x;
                break;
            }
        }
        return head;
    }
    private static Node insertValue(Node head, int ele, int val){
        //insert a element before the value
        if(head  == null){
            return null;
        }
        if(head.data == val){
            return new Node(val, head);
        }
        Node temp = head;
        while(temp != null){
            if(temp.next.data == val){
                Node x = new Node(ele, temp.next);
                temp.next = x;
                found = true;
                break;
            }
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
        System.out.println("\nTail is removed :");print(head);
        int k = 4;
        head = removeK(head, k);
        System.out.println("\nAfter removing "+k+"th element:");print(head);
        head = insertHead(head, 45);// we are storing the new node at head
        System.out.println("\nAfter inserting at head:");print(head);
        head =insertTail(head, 123);
        System.out.println("\nAfter inserting at tail:");print(head);
        k = 55;
        head =insertPosition(head, 999, k);
        System.out.println("\nAfter inserting at "+k+"th positiong:");print(head);
        int val = 99999;
        head = insertValue(head, 8888, 999);
        System.out.println("\nInserting before "+val+":");print(head);
        /* Manual way of converting array to LL
        Node n4 = new Node(arr[3]);
        Node n3 = new Node(arr[2], n4);
        Node n2 = new Node(arr[1], n3);
        Node head = new Node(arr[0],n2);
        System.out.println(n2.data+" "+ n2.next.data);
        */
    }
}