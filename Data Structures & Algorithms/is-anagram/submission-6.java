class Solution {

    public boolean isAnagram(String s, String t) {

        // If lengths are different, they can't be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Frequency array for letters a-z
        int[] counts = new int[26];

        // Increase count for s and decrease count for t
        for (int i = 0; i < s.length(); i++) {

            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }

        // Check if all counts are zero
        for (int count : counts) {
            if (count != 0) {
                return false;
            }
        }

        // Strings are anagrams
        return true;
    }
}
