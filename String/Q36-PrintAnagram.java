import java.util.*;
class Solution {
    public List<List<String>> Anagrams(String[] string_list) {
        // Code here
    
        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < string_list.length; i++) {
            char arr[] = string_list[i].toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);

            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(string_list[i]);
         }
        return new ArrayList<>(map.values());
    }
}

