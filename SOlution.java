import java.util.HashSet;
import java.util.Set;

class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        // Create a set of banned numbers for quick lookup
        Set<Integer> bannedSet = new HashSet<>();
        for (int num : banned) {
            bannedSet.add(num);
        }
        
        int count = 0;
        int currentSum = 0;

        // Iterate through numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            // If the number is not banned and adding it won't exceed maxSum
            if (!bannedSet.contains(i) && currentSum + i <= maxSum) {
                currentSum += i;
                count++;
            }
        }

        return count;
    }
}
