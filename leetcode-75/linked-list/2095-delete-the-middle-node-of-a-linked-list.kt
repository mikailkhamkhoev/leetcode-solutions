// Time complexity: O(n)
// Space complexity: O(1)

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    fun deleteMiddle(head: ListNode?): ListNode? {
        if (head == null || head.next == null) return null

        var slow: ListNode? = head
        var fast: ListNode? = head
        var prev: ListNode? = null

        while (fast != null && fast.next != null) {
            prev = slow
            slow = slow!!.next
            fast = fast.next!!.next
        }

        prev!!.next = slow!!.next

        return head
    }
}