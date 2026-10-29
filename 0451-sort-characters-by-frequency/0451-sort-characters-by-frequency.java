
import java.util.*;

class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> freq = new HashMap<>();

        // Step 1: Count frequency
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        // Step 2: Create buckets based on frequency
        List<Character>[] bucket = new ArrayList[s.length() + 1];

        for (char c : freq.keySet()) {
            int count = freq.get(c);

            if (bucket[count] == null) {
                bucket[count] = new ArrayList<>();
            }

            bucket[count].add(c);
        }

        // Step 3: Build result from highest frequency to lowest
        StringBuilder ans = new StringBuilder();

        for (int i = bucket.length - 1; i >= 1; i--) {
            if (bucket[i] != null) {
                for (char c : bucket[i]) {
                    for (int j = 0; j < i; j++) {
                        ans.append(c);
                    }
                }
            }
        }

        return ans.toString();
    }
}
