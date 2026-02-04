import java.util.*;
import java.util.*;

// Node class represents a
// node in a linked list
class Node {
    // Data stored in the node
    int data;

    // Pointer to the next node in the list
    Node next;

    // Constructor with both data 
    // and next node as parameters
    Node(int data1, Node next1) {
        data = data1;
        next = next1;
    }

    // Constructor with only data as
    // a parameter, sets next to null
    Node(int data1) {
        data = data1;
        next = null;
    }
}

class Solution{
    public static int lengthLoopBrute(Node head){
        if(head == null || head.next == null) return 0;
        Node temp = head;
        int pos = -1;
        HashMap<Node, Integer> nodeMap = new HashMap<>();
        while(temp != null){
            if(nodeMap.containsKey(temp)){
                int start = nodeMap.get(temp);
                pos++;
                return pos - start;
            }
            pos++;
            nodeMap.put(temp, pos);
            temp = temp.next;
        }
        return 0;

    }
    public static int lengthLoopOptimal(Node head){
        if(head == null || head.next == null) return 0;
        int slowCount = 0;
        int fastCount = 0;
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                Node temp = slow.next;
                int count = 1;
                while(temp != slow){
                    count++;
                    temp = temp.next;
                }
                return count;
            }
        }
        return 0;
    }
}

public class lengthOfLoop {
    public static void main(String[] args) {
        // Create a sample linked list
        // with a loop for testing
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        // Create a loop
        fifth.next = third;

        Solution sol = new Solution();

        // Check if there is a loop 
        // in the linked list
        int result = sol.lengthLoopOptimal(head);
        System.out.println("Length of Loop:"+result);
        
    }
}