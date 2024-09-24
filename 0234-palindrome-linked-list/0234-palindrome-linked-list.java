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
    public boolean isPalindrome(ListNode head) {

        List<Integer> values = new ArrayList<>();
        ListNode currentNode = head;
        while (currentNode != null) {
            values.add(currentNode.val);
            currentNode = currentNode.next;
        }

        // Step 2: Check if the list of values is a palindrome
        int start = 0, end = values.size() - 1;
        while (start < end) {
            if (!values.get(start).equals(values.get(end))) {
                return false;  // Not a palindrome
            }
            start++;
            end--;
        }

        return true;  // It's a palindrome
    }
}