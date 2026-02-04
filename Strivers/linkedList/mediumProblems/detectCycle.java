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

// Solution class with detectLoop function
class Solution {
    // function to detect loop in linked list
    public boolean detectLoopBrute(Node head) {
        // Initialize a pointer 'temp'
        // at the head of the linked list
        Node temp = head;
        int pos = -1;
        // Create a map to keep track of
        // encountered nodes
        HashMap<Node, Integer> nodeMap = new HashMap<>();

        // Step 2: Traverse the linked list
        while (temp != null) {
            // If the node is already in the
            // map, there is a loop
            if (nodeMap.containsKey(temp)) {
                return true;
            }
            // Store the current node
            // in the map
            nodeMap.put(temp, pos);
            // Move to the next node
            temp = temp.next;
        }

        // Step 3: If the list is successfully traversed 
        // without a loop, return false
        return false;
    }
    public boolean tortoiseAndHare(Node head){
        if(head == null) return false;

        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next == null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false
    }
}
// Driver class
public class detectCycle {
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
        boolean result = sol.detectLoopBrute(head);
        if (result) {
            System.out.println("Cycle is detected");
        } else {
            System.out.println("No loop detected in the linked list.");
        }
    }
}
