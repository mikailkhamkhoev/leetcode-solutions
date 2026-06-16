// Time Complexity: O(n)
// Space Complexity: O(n + k) (k = total #of keys)

class Solution {
    fun canVisitAllRooms(rooms: List<List<Int>>): Boolean {
        val queue = ArrayDeque<Int>()
        val visited = BooleanArray(rooms.size) { false }

        visited[0] = true
        queue.addLast(0)

        while (queue.isNotEmpty()) {
            val currentRoom = queue.removeFirst()
            for (key in rooms[currentRoom]) {
                if (!visited[key]) {
                    visited[key] = true
                    queue.addLast(key)
                }
            }
        }

        for (i in visited.indices) {
            if (!visited[i]) return false
        }

        return true
    }
}

/* using dfs (from LeetCode):

class Solution {
    fun canVisitAllRooms(rooms: List<List<Int>>): Boolean {
        val visited = BooleanArray(rooms.size)

        fun dfs(room: Int) {
            if (visited[room]) {
                return
            }

            visited[room] = true

            for (key in rooms[room]) {
                dfs(key)
            }
        }

        dfs(0)

        return visited.all { it }
    }
}

 */