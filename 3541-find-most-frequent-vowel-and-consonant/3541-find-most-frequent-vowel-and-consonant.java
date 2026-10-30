
class Solution {
    public int maxFreqSum(String s) {

        HashMap<Character, Integer> Cons = new HashMap<>();
        HashMap<Character, Integer> Vowel = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {

                if (Vowel.containsKey(ch)) {
                    Vowel.put(ch, Vowel.get(ch) + 1);
                } else {
                    Vowel.put(ch, 1);
                }

            } else {
                if (Cons.containsKey(ch)) {
                    Cons.put(ch, Cons.get(ch) + 1);
                } else {
                    Cons.put(ch, 1);
                }
            }
        }

        int maxVowel = Vowel.isEmpty() ? 0 :
                       Collections.max(Vowel.values());

        int maxCons = Cons.isEmpty() ? 0 :
                      Collections.max(Cons.values());

        return maxVowel + maxCons;
    }
}
