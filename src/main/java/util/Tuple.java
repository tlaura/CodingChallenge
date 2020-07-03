package util;

import lombok.Getter;

@Getter
public class Tuple {
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
