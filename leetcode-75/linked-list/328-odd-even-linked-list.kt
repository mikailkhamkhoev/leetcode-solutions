// Time complexity: O(n)
// Space complexity: O(1)

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    fun oddEvenList(head: ListNode?): ListNode? {
        if (head == null || head.next == null) {
            return head
        }

        var odd = head
        var even = head.next
        val evenHead = even

        while (even != null && even.next != null) {
            odd!!.next = even.next
            odd = odd.next

            even.next = odd!!.next
            even = even.next
        }

        odd!!.next = evenHead

        return head
    }
}