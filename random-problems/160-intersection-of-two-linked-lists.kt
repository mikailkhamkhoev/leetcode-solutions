// Time Complexity: O(n + m)
// Space Complexity: O(1)

class Solution {
    fun getIntersectionNode(headA: ListNode?, headB: ListNode?): ListNode? {
        var pA = headA
        var pB = headB

        while (pA != pB) {
            pA = if (pA == null) headB else pA.next
            pB = if (pB == null) headA else pb.next
        }

        return pA
    }
}