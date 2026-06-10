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
    private var maxLength = 0

    fun longestZigZag(root: TreeNode?): Int {
        dfs(root, true, 0)
        dfs(root, false, 0)
        return maxLength
    }

    private fun dfs(node: TreeNode?, isLeft: Boolean, length: Int) {
        if (node == null) return

        maxLength = maxOf(maxLength, length)

        if (isLeft) {
            dfs(node.left, true, 1)
            dfs(node.right, false, length + 1)
        } else {
            dfs(node.left, true, length + 1)
            dfs(node.right, false, 1)
        }
    }
}