class Solution {
    public String reverseByType(String s) {
        List<Character> letters = new ArrayList<>();
        List<Character> special = new ArrayList<>();

        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                letters.add(ch);
            } else {
                special.add(ch);
            }
        }
        Collections.reverse(letters);
        Collections.reverse(special);
        StringBuilder result = new StringBuilder();

        int letterIndex = 0;
        int specialIndex = 0;

        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                result.append(letters.get(letterIndex++));
            } else {
                result.append(special.get(specialIndex++));
            }
        }
        return result.toString();
    }
}