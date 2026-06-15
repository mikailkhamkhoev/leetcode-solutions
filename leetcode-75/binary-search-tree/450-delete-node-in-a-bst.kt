// Time Complexity: O(n)
// Space Complexity: O(1)

/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun deleteNode(root: TreeNode?, key: Int): TreeNode? {
        if (root == null) return null

        return when {
            key < root.`val` -> {
                root.left = deleteNode(root.left, key)
                root
            }

            key > root.`val` -> {
                root.right = deleteNode(root.right, key)
                root
            }
            else -> {
                deleteCurrentNode(root)
            }
        }
    }

    private fun deleteCurrentNode(node: TreeNode): TreeNode? {
        if (node.left == null && node.right == null) {
            return null
        }

        if (node.left == null) {
            return node.right
        }
        if (node.right == null) {
            return node.left
        }

        var successor = node.right
        while (successor?.left != null) {
            successor = successor.left
        }

        node.`val` = successor!!.`val`

        node.right = deleteNode(node.right, successor.`val`)

        return node
    }
}