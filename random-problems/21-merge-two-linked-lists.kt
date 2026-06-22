// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        val dummy = ListNode(-1)
        var tail = dummy
        var first = list1
        var second = list2

        while (first != null && second != null) {
            if (first.`val` <= second.`val`) {
                tail.next = first
                tail = tail.next
                first = first.next
            } else {
                tail.next = second
                tail = tail.next
                second = second.next
            }
        }

        if (first == null) {
            tail.next = second
        } else {
            tail.next = first
        }

        return dummy.next
    }
}