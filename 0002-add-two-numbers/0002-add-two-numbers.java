/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Create a dummy node to help easily build the result list
        ListNode dummy = new ListNode(0);
        ListNode current = dummy; 
        int carry = 0;  // Variable to store the carry from the sum of digits
        
        // Loop till both lists are fully traversed and there is no carry left
        while (l1 != null || l2 != null || carry != 0) {
            //the values of the current nodes, or 0 if one list is shorter
            int value1 = (l1 != null) ? l1.val : 0;
            int value2 = (l2 != null) ? l2.val : 0;
            
            // Calculate the sum of the values and the carry
            int sum = value1 + value2 + carry;
            
            // Update carry
            carry = sum / 10;
            
            // The current digit of the result will be the remainder of the sum (mod 10)
            int digit = sum % 10;
            
            // Add the new digit as the next node in the result list
            current.next = new ListNode(digit);
            
            // Move the current pointer forward in the result list
            current = current.next;
            
            // Move the pointers of the input lists forward (if they are not null)
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        
        return dummy.next;
    }
}
