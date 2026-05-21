// Time complexity: O(n)
// Space complexity: O(1)

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    fun pairSum(head: ListNode?): Int {

        // Step 1; Look for the middle of the linked list
        var slow = head
        var fast = head

        while (fast != null && fast.next != null) {
            slow = slow!!.next
            fast = fast.next!!.next
        }

        // Step 2; Reverse the second half of the linked list
        var prev: ListNode? = null
        var current = slow

        while (current != null) {
            val next = current.next
            current.next = prev

            prev = current
            current = next
        }

        // Step 3; Calculate maximum twin sum
        var maxSum = 0
        var first = head
        var second = prev

        while (second != null) {
            val sum = first!!.`val` + second.`val`
            if (sum > maxSum) {
                maxSum = sum
            }
            first = first.next
            second = second.next
        }

        return maxSum
    }
}