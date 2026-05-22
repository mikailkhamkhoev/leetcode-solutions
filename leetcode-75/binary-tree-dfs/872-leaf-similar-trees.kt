// Time complexity: O(n + m)
// Space complexity: O(n + m)

class Solution {
    fun leafSimilar(root1: TreeNode?, root2: TreeNode?): Boolean {
        val leaves1 = mutableListOf<Int>()
        val leaves2 = mutableListOf<Int>()

        getLeaves(root1, leaves1)
        getLeaves(root2, leaves2)

        return leaves1 == leaves2
    }

    private fun getLeaves(node: TreeNode?, leaves: MutableList<Int>) {
        if (node == null) return

        if (node.left == null && node.right == null) {
            leaves.add(node.`val`)
            return
        }

        getLeaves(node.left, leaves)
        getLeaves(node.right, leaves)
    }
}