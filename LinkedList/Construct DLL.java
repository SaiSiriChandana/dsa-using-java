class Solution {
    Node constructDLL(int arr[]) {
        // Code here
        Node head = new Node(arr[0]);
        Node back = head;

        // Loop through the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            // Create a new node with the current array element
            Node temp = new Node(arr[i]);
            temp.prev = back;    // Set the previous pointer of the new node
            back.next = temp;    // Set the next pointer of the previous node
            back = temp;         // Move the back pointer to the current node
        }
        return head;
    }
}
