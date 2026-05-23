// Time complexity: O(n)
// Space complexity: O(n)

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    fun goodNodes(root:TreeNode?): Int {
        return dfs(root, Int.MIN_VALUE)
    }

    private fun dfs(node: TreeNode?, maxSeen: Int): Int {
        if (node == null) return 0

        val isGood = if (node.`val` >= maxSeen) 1 else 0

        val nextMax = maxOf(maxSeen, node.`val`)

        return isGood +
                dfs(node.left, nextMax) +
                dfs(node.right, nextMax)
    }
}