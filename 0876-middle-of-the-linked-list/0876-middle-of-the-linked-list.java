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
    public ListNode middleNode(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        
        int counter = 0;
        
        while (head != null) {
            list.add(head);
            counter += 1;
            head = head.next;
        }
        
        
        return list.get(counter/2);       
    }
}