import java.util.*;
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

class Solution {
    public static Node optimal(Node head) {
        if(head == null || head.next == null){
            return head;
        }
        Node odd = head;
        Node even = head.next;
        Node evenHead = even;
        while(even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}
// Driver class
public class oddEvenList {
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
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }
    public static void main(String[] args) {
        int[] arr = {2,1,3,5,6,4,7,21,22};
        Node head = ArrayToLL(arr);


        Solution sol = new Solution();

        // Check if there is a loop 
        // in the linked list
        Node segregatedResult = sol.optimal(head);
        print(segregatedResult);
    }
}
// added new github id
