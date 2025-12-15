class CountVowels {

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch); // handle uppercase letters
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (isVowel(str.charAt(i))) {
                count++;
            }
        }
        System.out.println("Vowel: " + count);
    }

    public static void main(String[] args) {
        countVowels("Thulasi");
    }
}
