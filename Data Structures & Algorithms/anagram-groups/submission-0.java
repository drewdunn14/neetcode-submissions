class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> groupedAnagram = new ArrayList<List<String>>();

        Map<String, List<String>> mappedAnagram = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {

            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);
            
            mappedAnagram.computeIfAbsent(sortedString, k -> new ArrayList<>()).add(strs[i]);

            groupedAnagram = new ArrayList<>(mappedAnagram.values());


        }
        return groupedAnagram;
    }
    
}