class Solution {
    public boolean isAnagram(String s, String t) {

        s = convertToSortedString(s);

        t = convertToSortedString(t);

        return s.equalsIgnoreCase(t);

    }

    private String convertToSortedString(String input) {
        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
