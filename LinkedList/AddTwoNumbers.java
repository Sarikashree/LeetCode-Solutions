// LeetCode 2: Add Two Numbers
// Approach: Iterative, Linked List
// Time Complexity: O(max(m, n))
// Space Complexity: O(max(m, n))
// Logic: Iterate both lists, add digits + carry, create new list.

public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode dummy = new ListNode(0);
    ListNode current = dummy;
    int carry = 0;

    while(l1 != null || l2 != null) {
        int x = (l1 != null) ? l1.val : 0;
        int y = (l2 != null) ? l2.val : 0;

        int sum = x + y + carry;
        carry = sum / 10;
        current.next = new ListNode(sum % 10);
        current = current.next;

        if(l1 != null) l1 = l1.next;
        if(l2 != null) l2 = l2.next;
    }

    if(carry > 0) {
        current.next = new ListNode(carry);
    }

    return dummy.next;
}
