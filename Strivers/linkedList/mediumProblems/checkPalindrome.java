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
    
    public static boolean palindromeBrute(Node head) {
        if(head == null) return false;
        Stack<Integer> st = new Stack<>();
        Node current = head;

        while(current!=null){
            st.push(current.data);
            current = current.next;
        }
        current = head;
        while(!st.isEmpty()){
            if(st.pop() != current.data){
                return false;
            }
            current = current.next;
        }
        return true;
    }
    public Node reverse(Node head){
        Node prev = null;
        Node current = head;
        while(current != null){
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    public boolean palindromeOptimal(Node head){
        if(head == null || head.next == null){
            return true;
        }
        //find the middle node
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node headSecond = reverse(slow);
        Node first = head;
        Node second = headSecond;
        while(second != null){
            if(first.data != second.data){
                return false;
            }
            first = first.next;
            second = second.next;
        }
        return true;
    }

}
// Driver class
public class checkPalindrome {
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
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1};
        Node head = ArrayToLL(arr);


        Solution sol = new Solution();

        // Check if there is a loop 
        // in the linked list
        boolean result = sol.palindromeOptimal(head);
        if (result) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
