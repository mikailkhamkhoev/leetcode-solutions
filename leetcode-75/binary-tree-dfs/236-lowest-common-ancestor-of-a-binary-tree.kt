// Time complexity: O(n)
// Space complexity: O(n)

/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 */

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        if (root == null) return null
        if (root == p || root == q) return root

        val foundInLeft = lowestCommonAncestor(root.left, p, q)
        val foundInRight = lowestCommonAncestor(root.right, p, q)

        if (foundInLeft != null && foundInRight != null) return root

        if (foundInLeft != null) return foundInLeft
        if (foundInRight != null) return foundInRight

        return null
    }
}