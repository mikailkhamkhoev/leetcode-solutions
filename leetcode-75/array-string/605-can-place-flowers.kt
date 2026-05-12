// Time complexity: O(n)
// Space complexity: O(n)

class Solution {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        var count = 0
        var i = 0
        
        while (i < flowerbed.size) {
            if (flowerbed[i] == 0) {
                val prevEmpty = (i == 0 || flowerbed[i - 1] == 0)
                val nextEmpty = (i == flowerbed.size - 1 || flowerbed[i + 1] == 0)
                
                if (prevEmpty && nextEmpty) {
                    flowerbed[i] = 1
                    count++
                    i++
                }
            }
            if (count >= n) return true
            i++
        }
        
        return count >= n
    }
}
