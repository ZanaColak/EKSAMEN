package ovelse4Message;

import java.util.Arrays;

public class CodeMessage {
    private String plainText;
    private int[] ciphers;
    private int shiftValue;

    public long convertLetters(String s) {
         long result = 0;

        for (int i = 0; i < s.length(); i++) {
            final char ch = s.charAt(i);
            result += (int) ch;
        }

        return result;
    }
}


