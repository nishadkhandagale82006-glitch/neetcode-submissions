

class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {

        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {

            char[] chars = strs[i].toCharArray(); // convert char from string to array
            Arrays.sort(chars);  // sort this array of string char

            // char[] chars = {'a', 'e', 't'};
            // String key = String.valueOf(chars);
            // key = "aet"

            String key = String.valueOf(chars); // converts array into string

            // If this key is not present in the map,
            // create a new empty list.
            // key nahi manje navven values padtil na navven list baneen te pan empty
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            // "aet" -> ["eat", "tea"]
            // "ant" -> ["tan"]

            // strs[i] = "ate";
            // key = "aet";      key(aet)---->{ ate , eta ,tae }
            // map.get returns { ate , eta ,tae }

            map.get(key).add(strs[i]);
        }

        return new ArrayList<>(map.values());
    }
}