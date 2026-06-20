// Time Complexity: O(n)
// Space Complexity: O(n)

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun detectCycle(head: ListNode?): ListNode? {
        val visited = mutableSetOf<ListNode>()
        var current = head

        while (current != null) {
            if (current in visited) {
                return current
            }
            visited.add(current)
            current = current.next
        }

        return null
    }
}


// Floyd's space O(1)!!!
class Solution {
    fun detectCycle(head: ListNode?): ListNode? {
        var slow = head
        var fast = head

        while (fast?.next != null) {
            slow = slow?.next
            fast = fast.next?.next

            if (slow == fast) {
                slow = head
                while (slow != fast) {
                    slow = slow?.next
                    fast = fast?.next
                }

                return slow
            }
        }

        return null
    }
}