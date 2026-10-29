import java.util.*;

class Solution {
    public String frequencySort(String s) {
        boolean[] visited = new boolean[s.length()];
        String[] arr = new String[s.length()];
        int index = 0;

        // Step 1: Group identical characters together
        for (int i = 0; i < s.length(); i++) {
            if (visited[i]) {
                continue;
            }

            String str = "";

            for (int j = i; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    str = str + s.charAt(j);
                    visited[j] = true;
                }
            }

            arr[index] = str;
            index++;
        }

        // Step 2: Sort groups by decreasing length
        Arrays.sort(arr, 0, index, (a, b) ->
            Integer.compare(b.length(), a.length())
        );

        // Step 3: Combine all groups into one string
        String ans = "";

        for (int i = 0; i < index; i++) {
            ans = ans + arr[i];
        }

        return ans;
    }
}