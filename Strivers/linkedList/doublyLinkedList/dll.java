import java.util.*;
class Node{
    int data;
    Node next;
    Node prev;
    Node(int data1, Node next1, Node prev1){
        this.data = data1;
        this.next = next1;
        this.prev = prev1;
    }
    Node(int data1){
        this.data = data1;
        this.next = null;
        this.prev = null;
    }
}
class dll{
    private static Node convertToDLL(int[] arr){
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i = 1; i < arr.length ; i++){
            Node current = new Node(arr[i], null, prev);
            prev.next = current;
            prev = prev.next; // prev = current;
        }
        return head;
    }
    private static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    private static Node removeHead(Node head){
        if(head == null || head.next == null){
            return null;
        }
        Node prev = head;
        head = head.next;
        head.prev = null;
        prev.next = null;
        return head;
    }
    private static Node removeTail(Node head){
        if(head == null || head.next == null){
            return null;
        }
        Node tail = head;
        while(tail.next != null){
            tail = tail.next;
        }
        Node prev = tail.prev;
        prev.next= null;
        tail.prev = null;
        return head;
        
    }
    private static Node deleteK(Node head, int k){
        int count= 0;
        Node temp  = head;
        while(temp != null){
            count++;
            if(count == k){
                break;
            }
            temp = temp.next;
        }
        Node back = temp.prev;
        Node front = temp.next;
        //single node in DLL
        if(front == null && back == null){
            return null;
        }
        //at the end of DLL
        else if(front == null){
            temp.prev = null;
            back.next = null;
            // or return removeTail(head);
        }
        else if(back == null){
            head = head.next;
            // or return removeHead(head);
            
        }
        else{
            back.next= front;
            front.prev = back;
            temp.next= null;
            temp.prev = null;
        }
        return head;
    }
    private static void deleteNode(Node x){
        Node back = x.prev;
        Node front = x.next;
        if(front == null){
            back.next = null;
            x.prev = null;
            return;
        }
        back.next= front;
        front.prev = back;
        return;
    }
    private static Node insertHead(Node head, int val){
        Node newNode = new Node(val, head, null);
        head.prev = newNode;
        head = head.prev;
        return head;
    }
    private static Node insertBeforeTail(Node head, int val){
        Node tail = head;
        while(tail.next != null){
            tail = tail.next;
        }
        Node back = tail.prev;
        Node newNode = new Node(val, tail, back);
        tail.prev = newNode;
        back.next = newNode;
        return head;
    }
    private static Node insertBeforeKthElement(Node head, int val, int k){
        if(k == 1){
            Node x = new Node(val, head, null);
            head.prev = x;
            head = head.prev;
        }
        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
            if(count == k) break;
            temp = temp.next;
        }
        Node back = temp.prev;
        Node newNode = new Node(val, temp, back);
        back.next = newNode;
        temp.prev = newNode;
        return head;
    }
    private static void insertBeforeNode(Node node, int val){
        Node back = node.prev;
        Node current = new Node(val, node, back);
        back.next = node;
        node.prev = node;
        return;

    }
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6,7,8};
        Node head = convertToDLL(arr);
        print(head);
        head = removeHead(head);
        print(head);
        head = removeTail(head);
        print(head);
        head = convertToDLL(arr);
        head = deleteK(head,1);
        print(head);
        
    }
}