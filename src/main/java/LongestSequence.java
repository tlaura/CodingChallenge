import lombok.Getter;

public class LongestSequence {

    @Getter
    class Tuple {
        private char character;
        private int length;

        public Tuple(char character, int length) {
            this.character = character;
            this.length = length;
        }

        @Override
        public String toString() {
            return "( " + character + " - " + length + " )";
        }
    }

    public Tuple longestSequence(String letters) {
        letters = letters.toLowerCase();
        char[] chars = letters.toCharArray();
        int maxLength = 1;
        int currentCharLength = 1;
        char resultChar = chars[0];
        char currentChar = chars[0];

        for (int i = 1; i < chars.length; i++) {
            if(chars[i] == currentChar) {
                currentCharLength++;
                if(currentCharLength == maxLength && currentChar < resultChar) {
                    resultChar = currentChar;
                }
                if(currentCharLength > maxLength) {
                    resultChar = currentChar;
                    maxLength = currentCharLength;
                }
            } else {
                currentCharLength = 1;
                currentChar = chars[i];
            }
        }
        return new Tuple(resultChar, maxLength);
    }
}
