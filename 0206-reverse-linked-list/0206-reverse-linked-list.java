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
    public ListNode reverseList(ListNode head) {
//         ListNode cur = head;
//         ListNode prev = null;
        
//         // Looping through the list
//         while(cur !=null){
//             ListNode temp = cur.next;
//             cur.next = prev;
//             prev = cur;
//             cur = temp;
//     }
//     return prev;
        
        ListNode curr = head;
        ListNode prev = null;
        
        // looping through the list
        while(curr != null){
            ListNode Temp =  curr.next;
            curr.next = prev;
            prev = curr;
            curr = Temp;
        }
        
        return prev;
    }    
}