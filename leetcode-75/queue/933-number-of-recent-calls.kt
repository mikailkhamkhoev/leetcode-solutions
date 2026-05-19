// Time complexity: O(n)
// Space complexity: O(n)

class RecentCounter() {
    private val queue = ArrayDeque<Int>()

    fun ping(t: Int): Int {
        queue.addLast(t)
        while (queue.first() < t - 3000) {
            queue.removeFirst()
        }

        return queue.size
    }
}