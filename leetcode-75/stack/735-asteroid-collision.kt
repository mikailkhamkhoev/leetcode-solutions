// Time complexity: O(n)
// Space complexity: O(n)

class Solution {
    fun asteroidCollision(asteroids: IntArray): IntArray {
        val stack = ArrayList<Int>()

        for (ast in asteroids) {
            var alive = true

            while (alive && ast < 0 && stack.isNotEmpty() && stack.last() > 0) {
                val top = stack.last()
                if (top < -ast) {
                    stack.removeLast()
                } else if (top == -ast) {
                    stack.removeLast()
                    alive = false
                } else {
                    alive = false
                }
            }
            
            if (alive) {
                stack.add(ast)
            }
        }
        
        return stack.toIntArray()
    }
}